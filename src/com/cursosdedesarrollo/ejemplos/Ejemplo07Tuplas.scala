package com.cursosdedesarrollo.ejemplos

object Ejemplo07Tuplas {
  def main(args: Array[String]) {
    val t = (1, "hello", Console)
    //Accediendo a valores
    println(t._1)
    println(t._2)
    println(t._3)
    //Recorriendo una tupla
    t.productIterator.foreach{ i =>println("Value = " + i )}
    t.productIterator.foreach {println}

    var mapa = Map[String, Any]()
    mapa  += ("Cliente X" -> ("calle", "tlf", ""))
    val listadoMapas = List [Map[String, Any]](mapa)
    listadoMapas.foreach(println)

  }
}
