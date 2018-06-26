package com.cursosdedesarrollo.ejemplos

object Ejemplo06Colleciones {
  def main(args: Array[String]) {
    //var cosas: List[Any] = List("manzanas", 2, "peras")
    var cosas = List("manzanas", 2, "peras")

    // Listado de cadenas
    var frutas: List[String] = List("manzanas", "naranjas", "peras")
    println( "Cabecera : " + frutas.head )
    println( "Cola : " + frutas.tail )
    println( "Comprueba si está vacío : " + frutas.isEmpty)
    println(frutas(1))
    println(frutas)
    frutas = "uvas" :: frutas
    println(frutas)
    frutas = frutas ::: List("melones")
    println(frutas)

    frutas.foreach({
      println
    })

    for (fruta <- frutas){
      println(fruta)
    }
    // Listado de dos dimensiones
    var dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
    println(dim)
    for (fila <- dim){
      println(fila)
      for (col <- fila){
        println(col)
      }
    }

    var frutas2 = List.fill(3)("peras")
    println(frutas2)

    var x = List(5, 1, 4, 3, 2)
    println("Filtro")
    //x = x.filter( a => a >= 4)
    x = x.filter(_ >= 4)
    println(x)

    var listado = List(1,2,3)
    //var listadoMapeado = listado.map(a => a * 2)
    var listadoMapeado = listado.map(_ * 2)
    println("Mapeo")
    println(listadoMapeado)


    var nombres = List("Fred", "Joe", "Bob")
    val minus = nombres.map(_.toLowerCase)
    println(minus)


    var mapa:Map[Char,Int] = Map()

    mapa += ('I' -> 1)
    mapa += ('J' -> 5)
    mapa += ('K' -> 10)
    mapa += ('L' -> 100)
    println(mapa)
    println(mapa.keys)
    println(mapa.values)
    println(mapa.isEmpty)
    println(mapa.get('I'))
    mapa.keys.foreach{ i =>
      print( "Clave = " + i )
      println(" Valor = " + mapa(i) )
    }




  }
}
