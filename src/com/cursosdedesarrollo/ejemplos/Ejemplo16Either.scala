package com.cursosdedesarrollo.ejemplos

object Ejemplo16Either {
  def main(args: Array[String]) {
    // Reference: https://www.geeksforgeeks.org/scala-either/
    def Name(name: String): Either[String, String] =
    {

      if (name.isEmpty)
      // Left child for failure
        Left("There is no name.")

      else
      // Right child for success
        Right(name)
    }

    // Displays this if name is
    // not empty
    println(Name("GeeksforGeeks"))

    // Displays the String present
    // in the Left child
    println(Name(""))


    // Defining a method and applying
    // Either
    def Division(q: Int, r: Int): Either[String, Int] =
    {
      if (q == 0)
      // Left child for failure
        Left("Division not possible.")
      else
      // Right child for success
        Right(q / r)
    }

    // Assigning values
    val x = Division(4, 2)

    // Applying pattern matching
    x match
    {
      case Left(l) =>

        // Displays this if the division
        // is not possible
        println("Left: " + l)

      case Right(r) =>

        // Displays this if division
        // is possible
        println("Right: " + r)
    }
    /*

    def divideXByY(x: Int, y: Int): Either[String, Int] = {
      if (y == 0) Left("Dude, can't divide by 0")
      else Right(x / y)
    }

    // a few different ways to use Either, Left, and Right
    println(divideXByY(1, 0))
    println(divideXByY(1, 1))
    divideXByY(1, 0) match {
      case Left(s) => println("Answer: " + s)
      case Right(i) => println("Answer: " + i)
    }

     */
  }
}
