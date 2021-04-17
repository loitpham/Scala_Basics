package Scala_Basics

/**
 * Fri, 16 Apr 2021, 4:09 PM
 * Description:
 *
 * */
object factorialWhileExample {
  def main(arg: Array[String]): Unit = {
    var result = 1
    var num = 5

    while (num > 0) {
      result *= num
      num -= 1
    }

    println(result)
  }
}
