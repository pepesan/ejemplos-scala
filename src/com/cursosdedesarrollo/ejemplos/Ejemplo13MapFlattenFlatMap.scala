package com.cursosdedesarrollo.ejemplos

object Ejemplo13MapFlattenFlatMap {
  def main(args: Array[String]) {
    //Map
    val listado = List(5, 1, 4, 3, 2)
    var listadoMapeado = listado.map(_*2)
    println(listadoMapeado)
    //Referencia: http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-flatten-function-example/
    // Flatten
    val names = List("Nidhi", "Singh")
    val result1 = names.map(_.toLowerCase)
    val result2 = result1.flatten
    println(result2) // muestra todas las letras
    // otro ejemplo
    val lista1 = List("Uno", "Dos")
    val lista2 = List("Tres", "Cuatro")
    val listDonuts: List[List[String]] = List(lista1, lista2)
    val listDonutsFromFlatten: List[String] = listDonuts.flatten
    println(listDonutsFromFlatten)
    val listDonutsFromFlatten2: List[String] = listDonuts.flatten.map(_ + " Donut")
    println(listDonutsFromFlatten2)

    //flatMap
    // Referencia: https://www.geeksforgeeks.org/scala-flatmap-method/
    val aplanado = names.flatMap(_.toLowerCase)
    println(aplanado) // listado de letras en minúsculas
    //otro ejemplo
    // Creating a list of numbers
    val list = List(2, 3, 4)

    // Defining a function
    def f(x:Int) = List(x-1, x, x+1)

    // Applying flatMap
    var result = list.flatMap(y => f(y))
    result = list.flatMap(f)
    result = list.flatMap( x => {
      List(x+1,x,x+1)
    })
    // Displays output
    println(result)
    var result3 = list.map(y => f(y))

    // Displays output
    println(result3)

  }
}
