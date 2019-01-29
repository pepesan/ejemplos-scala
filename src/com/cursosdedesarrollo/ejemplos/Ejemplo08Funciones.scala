package com.cursosdedesarrollo.ejemplos

object Ejemplo08Funciones {
  def main(args: Array[String]) {

    def procedimiento ={
      println("Hola Funcion!!")
    }
    procedimiento

    def unParametro(x:Any)={
      println(x)
    }
    unParametro("Hola")

    // Definiendo funciones
    def addInt( a:Int, b:Int ) :Int = {
      a + b
    }
    /*
    def addInt( a:Int, b:Int ) : Int = {

      var sum:Int = 0
      sum = a + b
      return sum
    }
    */
    var c=addInt(2,3)
    /*
    c=addInt(a=7,b=2)
    c=addInt(b=7,a=2)
    */
    println(c)
    //Definiendo parámetros por defecto
    def addInt2( a:Int = 5, b:Int = 7 ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
    }

    c=addInt2()
    c=addInt2(5)
    c=addInt2(5,7)
    println(c)

    def sumaCosa(a:Any,b:Any):Any={

    }


    def printInt( a:Int =5, b:Int =7 ) = {
      println("Value of a : " + a )
      println("Value of b : " + b )
    }
    //llamando a funciones con parámetros nombrados
    printInt(b = 5)
    printInt(b = 5,a = 2)

    def multiSuma( a:Int =0, b:Int =0, c:Int =0, d:Int =0):Int={
      a+b+c+d
    }
    println(multiSuma())
    println(multiSuma(c=2))
    println(multiSuma(3,0,0,5))
    println(multiSuma(a=3,d=5))
    println(multiSuma())


    def suma(conSumando:Int=0, YSumando:Int=0):Int={
      conSumando+YSumando
    }



    //funciones anónimas
    var inc = (x:Int) => x+1
    /* versión JS
      var inc=function (a){
        return a+1
      }
     */


    var x = inc(7)-1
    println(x)
    println(inc)

    def devuelveTupla( a:Int =5, b:Int =7 ):Any = {
      return (a,b)
    }
    val (a,b)=devuelveTupla(4,5)
    println(a)
    println(b)
    val t=devuelveTupla(4,5)
    println(t)

    def manejaLista(listado:List[Any]):Unit={

    }
  }
}
