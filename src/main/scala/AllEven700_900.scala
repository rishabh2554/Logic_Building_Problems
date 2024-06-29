/*
10. Write a program to print all even numbers in range 700 to 900.
 */

object AllEven700_900 {
  def main(args:Array[String]):Unit={
    for(i <- 700 to 900)
      if( i%2==0)
        println(s"$i is Even number under range 700 to 900")
  }

}
