package Scala_Basics

/**
 * Fri, 16 Apr 2021, 1:58 PM
 * Description:
 *
 * */
object whileExample {
  def main(arg: Array[String]): Unit = {
    var i = 10
    while (i > 0) {
      println("Hello : " + i)
      i -= 1
    }
  }
}
