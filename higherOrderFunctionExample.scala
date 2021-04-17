package Scala_Basics

/**
 * Fri, 16 Apr 2021, 5:07 PM
 * Description:
 *
 * */
object higherOrderFunctionExample {
  def main(arg: Array[String]): Unit = {
    def id(x: Int): Int = x

    // sumInt(a = 2, b = 4)
    // 2 + sumInt(a = 3, b = 4)
    // 2 + 3 + sumInt(a = 4, b = 4)
    // 2 + 3 + 4 + sumInt(a = 5, b = 4)
    // 2 + 3 + 4 + 0 = 9
    def sumInt(a: Int, b: Int): Int = {
      if (a > b) 0 else id(a) + sumInt(a + 1, b)
    }

    def square(x: Int): Int = x * x

    def sumSquare(a: Int, b: Int): Int = {
      if (a > b) 0 else square(a) + sumSquare(a + 1, b)
    }

    // powerOfTwo(3)
    // 2 * powerOfTwo(2)
    // 2 * 2 * powerOfTwo(1)
    // 2 * 2 * 2 * powerOfTwo(0)
    // 2 * 2 * 2 * 1 = 2^3 = 8
    def powerOfTwo(x: Int): Int =
      if (x == 0) 1 else 2 * powerOfTwo(x - 1)

    def sumOfPowerOfTwo(a: Int, b: Int): Int = {
      if (a > b) 0 else powerOfTwo(a) + sumOfPowerOfTwo(a + 1, b)
    }

    // Functional programming
    def sum(f: Int => Int, a: Int, b: Int): Int = {
      if (a > b) 0 else f(a) + sum(f, a + 1, b)
    }

    println(sumInt(2, 5))
    println(sum(id, 2, 5))

    println(sumSquare(2, 5))
    println(sum(square, 2, 5))

    println(sumOfPowerOfTwo(2, 5))
    println(sum(powerOfTwo, 2, 5))
  }
}
