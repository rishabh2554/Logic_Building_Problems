/*
11. Write a program to print all odd numbers from 251 to 51. like (251,249,...51)
 */

object AllOdd251_51 {
  def main(args:Array[String]):Unit={
     var even:String="("
    for(i <- 251 to 51 by -1) {
      if( (i==51) && (i%2!=0))
        even = even +i.toString + ")"
      else  if(i%2!=0)
        even = even + i.toString +","
    }
    println(even)

  }

}
