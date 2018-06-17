package com.cursosdedesarrollo.ejemplos

object Ejemplo10Traits {
  def main(args: Array[String]) {
    println("Hello, world!")

    trait Parlanchin {
      def habla() = println("Hablo por los codos")
    }

    class Animal
    class Rana extends Animal with Parlanchin {
      override def toString = "Rana"
    }


    val ranita = new Rana
    ranita.habla()

  }
}
