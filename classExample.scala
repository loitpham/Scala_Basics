package Scala_Basics

/**
 * Fri, 16 Apr 2021, 4:36 PM
 * Description:
 *
 * */
object classExample {
  def main(arg: Array[String]): Unit = {
    var ob = new NewClass("Hello World!")
    ob.sayHi()

    var ob2 = new NewClass("Hello America!")
    ob2.sayHi()

    var ob3 = new NewClass("Hello Vietnam!")
    ob3.sayHi()
  }
}

class NewClass(msg: String) {
  def sayHi(): Unit = println(msg)
}
