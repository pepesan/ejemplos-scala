package com.cursosdedesarrollo.ejemplos

object Ejemplo02Resumen {
  def main(args: Array[String]) {

    val cadena = "Foo"

    val x = 1 + 1
    //x = 3 //los valores no cambian su valor
    var y = 1 + 1
    y = 3
    println(y * y) // 9

    //y="Cadena" // No puedo cambiar el tipo

    var z: Int = 1 + 1

    println({
      val x = 1 + 1
      x + 1
    }) // 3

    val addOne = (x: Int) => x + 1
    /*
    def addOne (x: Int) {
      return x + 1
    }
     */
    println(addOne(1)) // 2

    val add = (x: Int, y: Int) => x + y
    println(add(1, 2)) // 3

    val getTheAnswer = () => 42

    /*
    def getTheAnswer  (){
     return 42;
     }
     */
    println(getTheAnswer()) // 42
  }
}
