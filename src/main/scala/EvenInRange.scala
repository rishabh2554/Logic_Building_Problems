/*
12. Write a Program to print the count of the even numbers between the given
range?
 */

object EvenInRange {

  def main(args:Array[String]):Unit={

    val range1 = (120, 200)
    val range2 = (500, 600)
    var evenCount=0
    def findEvenInRange( r:(Int,Int)):Unit={
      for( i <- r._1 to r._2)
        if(i%2==0)
          evenCount+=1
        else
          evenCount = evenCount

      println(s"Count of even numbers between $r is $evenCount")
        }

     findEvenInRange(range1)
     findEvenInRange(range2)
  }

}
