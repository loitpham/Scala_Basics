package Scala_Basics

/**
 * Fri, 16 Apr 2021, 3:55 PM
 * Description:
 *
 * */
object doWhileExample {
  def main(arg: Array[String]): Unit = {
    var a = 2

    do {
      println(a)
      a += 2
    } while (a <= 10)

  }
}
