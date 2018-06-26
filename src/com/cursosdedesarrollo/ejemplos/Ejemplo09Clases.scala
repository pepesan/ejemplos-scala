package com.cursosdedesarrollo.ejemplos

object Ejemplo09Clases {
  def main(args: Array[String]) {

    class Coche(var marca: String ="", var modelo: String=""){
      override def toString: String =
        s"Coche(Marca: $marca, Modelo: $modelo)"
    }

    var c=new Coche("Toyota","")
    println(c)
    c.marca="Toyota"
    c.modelo="Auris"
    println(c)

    class Privados(){
      private var _prop: Int=0
      private val bound = 100

      def prop=_prop

      def prop_ (newValue: Int): Unit = {
        if (newValue < bound) _prop = newValue else printWarning
      }

      private def printWarning = println("WARNING: Out of bounds")
      override def toString: String =
        s"(Propiedad: $prop)"
    }

    var privado= new Privados
    privado.prop_(2)
    println(privado)

    abstract class Figura {
      var nombre: String
      var coordSupIzq : (Int,Int)
      var coordInfDer : (Int,Int)
      def print(): Unit
      def setCoords(c1:(Int,Int), c2:(Int,Int)) = {
        coordSupIzq = c1
        coordInfDer = c2
      }
    }



    class Rectangulo(name:String) extends Figura {
      var nombre = name
      var coordSupIzq = (0,0)
      var coordInfDer = (0,0)
      def print():Unit = {
        println("Coord 1: " + coordSupIzq)
        println("Coord 2: " + coordInfDer)
      }
    }

    var rectangulo = new Rectangulo("Uno")
    rectangulo.print()
    rectangulo.setCoords((1,2),(2,3))
    rectangulo.print()



    /*class Animal (var name: String="", var edad: Int=0) {

      // Constructor auxiliar
      def this (nombre: String) {
        this(nombre, 0)
      }
      override def toString = s"$name tiene $edad años"
    }
    */
    class Animal (var name: String="", var edad: Int=0) {

      // Constructor auxiliar
      def this (nombre: String) {
        this(nombre, 0)
      }
      override def toString = s"$name tiene $edad años"
    }

    // calls the Animal one-arg constructor
    class Perro (nombre: String="",raza:String ="",edad:Int=0)
      extends Animal (nombre,edad) {
      override def toString = s"$name de la raza $raza tiene $edad años"
    }
    var animal = new Animal("Bicho")
    println(animal)
    var perro = new Perro("Koty")
    println(perro)
    perro=new Perro("Nyska","Podenco",2)
    println(perro)

  }
}
