package com.cursosdedesarrollo.ejemplos

object Ejemplo10Traits {
  def main(args: Array[String]) {
    println("Hello, world!")

    trait Parlanchin {

      def habla() = println("Hablo por los codos")

      def parlotea():Unit
    }

    class Animal{
      def sound: String = ""
      var prop:String =""
    }
    class Rana extends Animal with Parlanchin {
      override def toString = "Rana"

      override def parlotea(): Unit = {

      }
    }


    val ranita = new Rana
    ranita.habla()

    trait Cat extends Animal {
      override def sound = "Miau"
    }

    trait Dog extends Animal {
      override def sound = "Guau"
    }
    case class Fox() extends Cat with Dog

    val myFox = Fox()
    println(myFox.sound)
    println(myFox.prop)

    trait Trato1 {
      var prop1 :String =""
      def funcion(): Unit ={
        println("")
      }
    }

    trait Trato2 {
      var prop2 :String =""
      def funcion2(): Unit ={
        println("")
      }
    }

    trait Trato3 {
      var prop3 :String =""
      def funcion3(): Unit ={
        println("")
      }
    }

    class HyperTrato extends Trato1 with Trato3 with Trato2 {
      override def toString = "Hypertrato"
    }
    var ht=new HyperTrato()
    println(ht)

  }
}
