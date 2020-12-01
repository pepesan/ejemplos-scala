package com.cursosdedesarrollo.ejercicios

object Funciones {
  def main(args: Array[String]) {
    def cuenta(listado: List[Any]){
      println(listado.length)
    }
    val listado = List("uno", "dos")
    cuenta(listado)

    def divide(a: Int = 1, b: Int = 1): Float = {
      a/b
    }
    println(divide(2,3))
    println(divide())
    println(divide(2))
    println(divide(b=3))


  }
}
