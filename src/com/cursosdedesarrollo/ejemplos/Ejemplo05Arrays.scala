package com.cursosdedesarrollo.ejemplos

object Ejemplo05Arrays {
  def main(args: Array[String]) {
    var z:Array[String] = new Array[String](3)
    println(z)
    var z2 = new Array[String](3)
    println(z2)

    //Accediendo a un valor
    z(0)="Hola"
    println(z(0))

    var z3 = Array("Zara", "Nuha", "Ayan")
    println(z3)
    println(z3(0))

    // Print all the array elements
    for ( x <- z3 ) {
      //x=2  // x es inmutable
      println( x )
    }

    //Arrays multidimensionales
    val matrix = Array.ofDim[Int](2,2)

    matrix(0)(0)=2
    matrix(0)(1)=4
    matrix(1)(0)=7
    matrix(1)(1)=9
    println(matrix(0)(0))
    println(matrix(0)(1))
    println(matrix(1)(0))
    println(matrix(1)(1))

    var matrix3 = Array.ofDim[Int](2,3,4)


    //concatenación de Arrays
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    println("Lista 3")
    var myList3 =  Array.concat( myList1, myList2)
    for ( x <- myList3 ) {
      print( " " + x )
    }
    println()
    //Rellenando un array con valores
    var myList4 = Array.range(10, 20, 2)
    println("Lista 4")
    for ( x <- myList4 ) {
      print( " " + x )
    }
    println()
    var myList5 = Array.range(10,20)
    println("Lista 5")
    for ( x <- myList5 ) {
      print( " " + x )
    }
    println()

    var res= myList5 contains(10)
    println(res)

    res= myList1.isEmpty
    println(res)

  }
}
