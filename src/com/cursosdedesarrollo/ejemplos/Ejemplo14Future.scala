package com.cursosdedesarrollo.ejemplos

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Ejemplo14Future {
  def main(args: Array[String]) {
    val a = Future { Thread.sleep(5*1000); 42 }
    println(a)
    val b = a.map(_ * 2)
    println(b)
    Thread.sleep(5*1000);
    a.onComplete {
      case Success(value) => println(s"Got the callback, value = $value")
      case Failure(e) => e.printStackTrace
    }
    // otro ejemplo
    def currentTime = System.currentTimeMillis()
    def deltaTime(t0: Long) = currentTime - t0
    def sleep(time: Long): Unit = Thread.sleep(time)
    def getStockPrice(stockSymbol: String): Future[Double] = Future {
      val r = scala.util.Random
      val randomSleepTime = r.nextInt(3000)
      val randomPrice = r.nextDouble * 1000
      sleep(randomSleepTime)
      randomPrice
    }
    val startTime = currentTime

    // (a) create three futures
    val aaplFuture = getStockPrice("AAPL")
    val amznFuture = getStockPrice("AMZN")
    val googFuture = getStockPrice("GOOG")

    val result: Future[(Double, Double, Double)] = for {
      aapl <- aaplFuture
      amzn <- amznFuture
      goog <- googFuture
    } yield (aapl, amzn, goog)
    result.onComplete {
      case Success(x) => {
        val totalTime = deltaTime(startTime)
        println(s"In Success case, time delta: ${totalTime}")
        println(s"The stock prices are: $x")
      }
      case Failure(e) => e.printStackTrace
    }

    // important for a short parallel demo: you need to keep
    // the jvm’s main thread alive
    sleep(5000)
  }
}
