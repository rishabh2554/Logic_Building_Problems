/*
3. Declare and initialize 3 three variable and print the biggest number.
 */

object GreatestOf3 {
  def main(args: Array[String]): Unit = {
    val num1 = 2
    val num2 = 5
    val num3 = 8

    def max3(a: Int, b: Int, c: Int): Unit = {
      if (a > b)
        if (a > c)
          println(s"$a is the biggest number ")
        else
          println(s"$c is the biggest number ")
      else if (b > c)
        println(s"$b is the biggest number ")
      else
        println(s"$c is the biggest number ")
    }

    max3(num1, num3, num2)
  }

}

