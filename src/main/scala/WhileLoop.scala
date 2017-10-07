/*
  Use a while loop Write a program to repeatedly do the following:
  1. Ask for a number, and
  2. print out a message that says what number you entered, and the square of
  that number (for example, 5 squared is 25).
  3. Quit when the number 0 is entered.
  (Remember that the readLine and println expressions must be inside curly braces,
  {}).
 */

import scala.io.StdIn

object WhileLoop {
  def main(args: Array[String]): Unit = {
    var input = 0 // Would like to use val instead

    do {
      input = StdIn.readLine("Give me a number (0 to exit): ").toInt
      println("You entered: " + input)
      println("The square of your input is: " + input * input)

    } while (input != 0)

    println("\nTHE END!")

    // When entering 0 it still considers it before exiting.
    // Should be fixed.
  }
}
