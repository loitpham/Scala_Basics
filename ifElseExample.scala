package Scala_Basics

/**
 * Fri, 16 Apr 2021, 7:49 PM
 * Description:
 *
 * */
object ifElseExample { // Everything in scala is an object
  def main(arg: Array[String]): Unit = {
    var x = 3

    if (x < 3) {
      println("x < 3")
    } else {
      println("x >= 3")
    }
  }
}
