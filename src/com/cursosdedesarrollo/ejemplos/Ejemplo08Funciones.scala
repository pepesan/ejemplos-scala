package com.cursosdedesarrollo.ejemplos

object Ejemplo08Funciones {
  def main(args: Array[String]) {
    // Definiendo funciones
    def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b
      return sum
    }
    var c=addInt(2,3)
    println(c)
    //Definiendo parámetros por defecto
    def addInt2( a:Int = 5, b:Int = 7 ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
    }

    c=addInt2()
    println(c)
    def printInt( a:Int, b:Int ) = {
      println("Value of a : " + a );
      println("Value of b : " + b );
    }
    //llamando a funciones con parámetros nombrados
    printInt(b = 5, a = 7)

    //funciones anónimas
    var inc = (x:Int) => x+1
    var x = inc(7)-1
    println(x)
  }
}
