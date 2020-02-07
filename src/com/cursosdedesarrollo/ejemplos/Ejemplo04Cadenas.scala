package com.cursosdedesarrollo.ejemplos

object Ejemplo04Cadenas {
  def main(args: Array[String]) {
    var cadena = "Hola Mundo"
    //longitud
    println(cadena.length)
    //minúsculas
    print(cadena.toLowerCase)
    //mayúsculas
    print(cadena.toUpperCase())
    var string1 = "Hola "
    var string2 ="Mundo!"
    println(string1.concat(string2))


    println("My name is ".concat("Zara"))

    println("Hello," + " world" + "!")



    val name = "David"
    val surname= "Vaquero"
    println(s"Hello, $name") //output: Hello, James


    val height = 1.9d
    println(f"$name%s is $height%2.2f meters tall") //James is 1.90 meters tall

    println(raw"Result = \n a \n b")

    println(s"Result = \n a \n b")
  }
}
