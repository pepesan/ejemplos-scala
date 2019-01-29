package com.cursosdedesarrollo.ejemplos

object Ejemplo09Clases {
  def main(args: Array[String]) {


    class MiClase(name:String){
      var nombre:String=name
    }
    var mc1=new MiClase("Pepe")
    println(mc1.nombre)


    class Coche(var marca: String ="", var modelo: String=""){

      private var prop2="Hola"

      override def toString: String =
        s"Coche(Marca: $marca, Modelo: $modelo)"
    }
    var c=new Coche("Toyota","")
    println(c)
    c.marca="Toyota"
    c.modelo="Auris"
    println(c.marca)
    var d= new Coche


    var mc=new MiClase("Juan")
    mc.nombre="Pepe"

    class Coche2(var marca: String ="", var modelo: String=""){

      private var _prop2="Hola"

      override def toString: String =
        s"Coche(Marca: $marca, Modelo: $modelo)"
    }

    class Privados(){
      private var _prop: Int=0
      private val bound = 100

      def prop=_prop

      def prop_ (newValue: Int): Unit = {
        if (newValue < bound) _prop = newValue else printWarning
      }

      def cambia={
        prop_(23)
      }

      private def printWarning = println("WARNING: Out of bounds")
      override def toString: String =
        s"(Propiedad: $prop)"
    }

    var privado= new Privados
    privado.prop_(2)
    println(privado)
    println(privado.prop)
    //privado.prop=2 //No es posible porque es privado
    privado.prop_(120)

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

      def miFunc:Unit={

      }
      def miFunc(i:Int=0):Unit={

      }
      override def toString = s"$name tiene $edad años"
    }

    // calls the Animal one-arg constructor
    class Perro (nombre: String="", edad:Int=0,var raza:String ="")
      extends Animal (nombre,edad) {

      override def toString = s"$name de la raza $raza tiene $edad años"
    }
    var animal = new Animal("Bicho")
    println(animal)
    var perro = new Perro("Koty")
    println(perro)
    println(perro.raza)
    println(perro.edad)
    perro=new Perro("Nyska",2,"Podenco")
    println(perro)
    perro=new Perro
    perro=new Perro(edad = 2)

    class Gato (nombre:String,edad:Int=0, var juguete:String="") extends Animal (nombre,edad){

    }
    var gato= new Gato("Gato")

  }
}
