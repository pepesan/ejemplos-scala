package com.cursosdedesarrollo.ejemplos


object Ejemplo15Option {
  def main(args: Array[String]) {

    // Reference: https://www.tutorialspoint.com/scala/scala_options.htm
    var name: Option[String] = Option("name")
    println(name.get)
    println(name getOrElse "Pepe")


    def show(x: Option[String]) = x match {
      case Some(s) => s
      case None => "?"
    }
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
    println(capitals.get( "Japan"))
    println("show(capitals.get( \"Japan\")) : " + show(capitals.get( "Japan")) )
    println(capitals.get( "India"))
    println("show(capitals.get( \"India\")) : " + show(capitals.get( "India")) )

    var a:Option[Int] = Some(5)
    var b:Option[Int] = None

    println("a.getOrElse(10): " + a.getOrElse(10) )
    println("b.getOrElse(10): " + b.getOrElse(10) )

    a = Some(5)
    b = None

    println("a.isEmpty: " + a.isEmpty )
    println("b.isEmpty: " + b.isEmpty )
  }


}
