package com.cursosdedesarrollo.ejercicios

object Clases {
  def main(args: Array[String]): Unit = {
    class Cliente(var nombre:String="", var direccion:String="", var tlf:String="", var email:String="",private var _cotizacion:Float = 0.0f){
      var total_cotizaciones:Float = 0.0f
      def cotizacion_(newValue:Float): Unit ={
        _cotizacion=newValue
        total_cotizaciones+=newValue
      }
      def cotizacion = _cotizacion
      override def toString: String = s"Cliente(nombre: $nombre, direccion:$direccion, tlf:$tlf, var email:$email, _cotizacion:$cotizacion, total_cotizaciones:$total_cotizaciones"

    }
    var entelgy= new Cliente("Entelgy","Pio Baroja, Bilbao", "944", "info@entelgy-ibai.com")
    entelgy.cotizacion_(3.0f)
    println(entelgy)
    var indra = new Cliente("Indra")
    println(indra)
    var gfi = new Cliente(direccion="Bilbao", nombre = "GFI")
    println(gfi)
    class Persona(var nombre:String="", var direccion:String=""){
      override def toString: String = s"Persona(nombre:$nombre,direccion:$direccion)"
    }
    var paco= new Persona("Paco")
    println(paco)
    var reme= new Persona("Reme")
    println(reme)
    class Empleado(nombre:String="", direccion:String="", var cargo:String="", var sueldo:Float=0.0f) extends Persona(nombre,direccion ){
      override def toString: String = s"Empleado(nombre:$nombre,direccion:$direccion, cargo:$cargo, sueldo:$sueldo)"
    }
    var ivan=new Empleado("Iván", direccion = "mi calle", cargo = "programador", sueldo = 15000)
    println(ivan)
    class Jefe (nombre:String="", direccion:String="", cargo:String="", sueldo:Float=0.0f, var nombreDepartamento:String="") extends Empleado(nombre,direccion, cargo, sueldo ){
      override def toString: String = s"Empleado(nombre:$nombre,direccion:$direccion, cargo:$cargo, sueldo:$sueldo, nombreDepartamento=$nombreDepartamento)"
    }
    var emilio=new Jefe()
    println(emilio)
  }

}
