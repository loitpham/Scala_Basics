package Scala_Basics

/**
 * Fri, 16 Apr 2021, 4:16 PM
 * Description:
 *
 * */
object matrixForLoopExample {
  def main(arg: Array[String]): Unit = {
    for (i <- 1 to 3; j <- 4 to 6) {
      println(i, j)
    }
  }
}
