/*
  Write a program In a text editor, write a program to compute and print the result
  of adding 2 and 2. Save this program in a le named test.scala, then run it by
  entering a :load command into the REPL. The :load command looks like this:
  :load complete_path_to_the_Scala_file

  Edit a program Edit your program to compute and print the result of 13 squared.
  (You can use 13 * 13, or 13 ** 2 to compute this.) Run the program by loading
  it in again.

  Write a function In your program, write a function named isEven that, given a single
  Int as a parameter, returns true if the remainder when divided by 2 is zero (the
  operator that gives you the remainder is %), and false otherwise. Reload the
  program and try calling the function with various numbers.
 */

object TwoPlusTwo {
  def main(args: Array[String]): Unit = {
    println("2 + 2 = " + (2 + 2))
    println("13 exp 2 = " + (13 * 13))

    isEven(6)
    isEven(7)
  }

  def isEven(num:Int) = {
    if (num % 2 == 0) {
      println("True! " + num + " It's an even number")
    } else {
      println("False! " + num + " It's an odd number")
    }
  }
}

// To run in REPL
// TwoPlusTwo.main(Array())
