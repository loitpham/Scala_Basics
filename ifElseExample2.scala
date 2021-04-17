package Scala_Basics

/**
 * Fri, 16 Apr 2021, 11:32 AM
 * Description:
 *
 * */
object ifElseExample2 {
  def main(arg: Array[String]): Unit = {
    var x = 75
    if (x >= 70) {
      println("Distinction")
    } else if (x >= 60 && x < 70) {
      println("First Class")
    } else if (x >= 50 && x < 60) {
      println("Second Class")
    } else if (x >= 40 && x < 50) {
      println("Pass Class")
    } else {
      println("Fail Class")
    }
  }
}
