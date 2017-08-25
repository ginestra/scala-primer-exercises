/*
  Use a for loop Write a program to print out the numbers 1 through 25 and, for each
  number, print its square and its cube on the same line. (You can use + to combine
  strings and numbers into a single string.)
*/

object ForLoop {
  def main(args: Array[String]): Unit = {
    var num = 1
    for (num <- 1 to 25) {
      println("Number " + num + ". Its square: " + num * num + " and its cube is: " + num * num * num + ".")
    }
  }
}
