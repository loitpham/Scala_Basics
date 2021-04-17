package Scala_Basics

/**
 * Fri, 16 Apr 2021, 4:33 PM
 * Description:
 *
 * */
object nestedFunctionExample {
  def main(arg: Array[String]): Unit = {

    def square(x: Double): Double = {
      x * x
    }

    def sumSquares(x: Double, y: Double): Double = {
      square(x) + square(y)
    }

    println(sumSquares(2, 3))
  }
}
