import scala.io.StdIn

object WhileLoop {
  def main(args: Array[String]): Unit = {
    var input = 0

    do {
      input = StdIn.readLine("Give me a number (0 to exit): ").toInt
      println("You entered: " + input)
      println("The square of your input is: " + input * input)

    } while (input != 0)

    println("\nTHE END!")
  }
}
