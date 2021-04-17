package Scala_Basics

/**
 * Fri, 16 Apr 2021, 4:56 PM
 * Description:
 *
 * */
object functionByNameExample {
  def main(arg: Array[String]): Unit = {
    def time(): Long = {
      println("Inside time function")
      System.nanoTime()
    }

    // 'time' here is a function
    // It will get called every time we mention it
    def exec(time: => Long): Long = {
      println("Inside exec function")
      println("Time: " + time)
      println("Exiting from exec function")
      time
    }

    // exec() will be executed first
    println("Main function: " + exec(time()))
  }
}
