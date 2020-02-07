package com.cursosdedesarrollo.ejemplos

import java.util

object Ejemplo06Colleciones {
  def main(args: Array[String]) {
    //var cosas: List[Any] = List("manzanas", 2, "peras")
    var cosas = List("manzanas", 2, "peras")

    // Listado de cadenas
    var frutas: List[String] = List("manzanas","Caquis", "naranjas", "peras")
    println( "Cabecera : " + frutas.head )
    println( "Cola : " + frutas.tail )
    println( "Comprueba si está vacío : " + frutas.isEmpty)
    println( "Comprueba si no está vacío : " + frutas.nonEmpty)
    println(frutas(1))
    println(frutas)
    frutas = "uvas" :: frutas
    println(frutas)
    frutas = frutas ::: List("melones")
    println(frutas)

    frutas.foreach({
      println
    })
    // for (String fruta in frutas){
    // System.out.println(fruta);
    //}
    for (fruta <- frutas){
      println(fruta)
    }
    // Listado de dos dimensiones
    // public List<String> vs List<List<String>>
    var dim: List[List[Int]] =
      List(
        List(1, 0, 0,1),
        List(0, 1, 0),
        List(0, 0, 1,0,5)
      )
    println(dim)
    for (fila <- dim){
      print(fila)

      for (col <- fila){
        print(col)

      }
      println(",")
    }
    println()

    var desafiototal = List.fill(3)("peras")
    println(desafiototal)

    /*
    var algo="peras"
    List<String> desafiototal = new ArrayList<String>();
    for ( var i=0; i<3;i++){
      desafiototal[i]=algo;
    }
    */

    var x = List(5, 1, 4, 3, 2)
    println("Filtro")
    /*
      temp = []
      for ( a <- x){
        if(a>=4){
        temp.append(x)
        }
      }
      x = temp
     */
    //x = x.filter( a => a >= 4)
    //x = x.filter( _ => _ >= 4) // esto no es valido, pero casi
    x = x.filter(_ >= 4)
    println(x)

    var listado = List(1,2,3)
    /*
      temp = []
      for ( a <- x){
        temp.append(a * 2)
      }
      return temp
     */
    //var listadoMapeado = listado.map(a => a * 2)
    /*
    var listadoMapeado = listado.map((a) =>{
      return a * 2
     });*/
    //var listadoMapeado = listado.map(_ => _ * 2)
    var listadoMapeado = listado.map(_ * 2)
    println("Mapeo")
    println(listadoMapeado)


    //var nombres:List[String] = List[String]("Fred", "Joe", "Bob")
    var nombres = List("Fred", "Joe", "Bob")
    var minus = nombres.map(_.toLowerCase)
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
    println(mapa.nonEmpty)
    println(mapa.get('I'))
    println(mapa('I'))
    // añadir un campo
    mapa += ('A' -> 2)
    println("Mapa(A):" + mapa('A'))
    mapa.keys.foreach(println(_))
    mapa.keys.foreach{ i =>
      print( "Clave = " + _ )
      println(" Valor = " + mapa(i) )
    }

    mapa.foreach(println(_))
    mapa.values.foreach(println(_))




  }
}
