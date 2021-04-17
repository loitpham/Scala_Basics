package Scala_Basics

/**
 * Fri, 16 Apr 2021, 4:25 PM
 * Description:
 *
 * */
object functionExample {
  def main(arg: Array[String]): Unit = {
    def add(a: Double = 1, b: Double = 2): Double = {
      var sum: Double = 0
      sum = a + b
      sum
    }

    println(add(3, 4))
    println(add(5))
    println(add(b = 6))
  }
}
