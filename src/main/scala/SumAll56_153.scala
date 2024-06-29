/*
9. Write a program to sum all the numbers from 56 to 153.
 */
object SumAll56_153 {
  def main(args:Array[String]):Unit={
    var sum = 0
    for(i <- 56 to 153)
      sum+=i

    println(s"Total sum of numbers between 56 to 153 is $sum")

  }

}
