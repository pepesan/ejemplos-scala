package com.cursosdedesarrollo.ejemplos

object Ejemplo03Variables {
  def main(args: Array[String]) {
    //Valores (constantes)
    val myVal :String = "Valor declarado";

    // Las variables se definen con la palabra reservada var
    /*
      Pueden definir el tipo tras los :
     */
    var bar : String = "Foo"
    // No pueden cambiar de tipo
    //myVar=2;
    bar="Otro Valor"

    //Pueden inferir el tipo
    var myVar2 = "Foo"
    println(myVar2)

    var entero = 2
    println(entero)

    var flotante = 2.0
    println(flotante)

    var booleana = true
    println(booleana)

    var caracter = 'a'
    println(caracter)

    var cadena = "Hola Mundo"
    println(cadena)
  }
}
