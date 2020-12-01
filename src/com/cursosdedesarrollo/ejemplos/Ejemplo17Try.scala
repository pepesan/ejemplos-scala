package com.cursosdedesarrollo.ejemplos

import scala.io.Source
import scala.util.{Try,Success,Failure}

object Ejemplo17Try {
  def main(args: Array[String]) {
    // Reference: https://alvinalexander.com/scala/try-success-failure-example-reading-file/
    def readTextFile(filename: String): Try[List[String]] = {
      Try(Source.fromFile(filename).getLines.toList)
    }

    val filename = "./data/fichero.txt"
    readTextFile(filename) match {
      case Success(lines) => lines.foreach(println)
      case Failure(f) => println(f)
    }
  }
}
