/*
8. Write a program to print all numbers which are divisible by 11 from 250 to 550.
 */

object DivisibleBy11 {

  def main(args:Array[String]):Unit={
    var count=0
    for(i <- 250 to 550) {
      if( i%11==0) {
      println(s"$i is divisible by 11 under range 250-550")
      count += 1
      }
    }
    println(s"$count digist are divisible by 11 under range 250-550")
  }
}
