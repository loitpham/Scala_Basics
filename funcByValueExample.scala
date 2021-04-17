package Scala_Basics

/**
 * Fri, 16 Apr 2021, 4:47 PM
 * Description:
 *
 * */
object funcByValueExample {
  def main(arg: Array[String]): Unit = {
    def time(): Long = {
      println("Inside time function")
      System.nanoTime()
    }

    def exec(time: Long): Long = {
      println("Inside exec function")
      println("Time: " + time)
      println("Exiting from exec function")
      time
    }

    println("Main function: " + exec(time()))
  }
}
