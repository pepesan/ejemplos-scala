package com.cursosdedesarrollo.ejemplos

import scala.annotation.switch

object Ejemplo11EstructurasControl {
  def main(args: Array[String]) {
    val x = 10

    if (x < 20){
      println("If")
    }

    if (x < 20){
      println("If")
    }
    else{
      println("Else")
    }


    if (x == 10){
      println("X es 10")
    }
    else if (x == 20){
      println("X es 20")
    }
    else if (x == 30){
      println("X es 30")
    }
    else{
      println("Else")
    }


    var a = 10
    // while loop execution
    while (a < 20) {
      println("a: " + a)
      a = a + 1
    }


    a = 10

    // do loop execution
    do {
      println( "a: " + a )
      a = a + 1
    }
    while( a < 20 )

    a = 0

    // for loop execution with a range
    for( a <- 1 to 10){
      println( "a: " + a )
    }


    var factor = 3
    //val multiplier = (i:Int) => i * factor
    val multiplier = (i:Int) => {
      i * factor
    }
    var c=multiplier(2)
    println(c)


    // for loop execution with a range
    for( a <- 5 to 20){
      println( "a: " + a )
    }
    /*
    while ({
      true
    }){
    }
    */

    val i = 1
    val x2 = (i: @switch) match {
      case 1  => "One"
      case 2  => "Two"
      case _  => "Other"
    }
  }
}
