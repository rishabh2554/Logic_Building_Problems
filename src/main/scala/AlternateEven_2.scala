/*
14. Write a program to print alternate even numbers from 20 to 140. Like
(22,26,30...)
 */
object AlternateEven_2 {
  def main(args:Array[String]):Unit={

    val range1=(20, 89)
    val range2=(100,150)


    def findAltEven(r:(Int,Int)):Unit={
      var result = "("
      for( i <- r._1 to r._2)
        if((i%4!=0) && (i%2==0))
          if ((i == r._2 - 3) || ( i == r._2))
            result = result + i + ')'
          else
            result = result + i + ','
        else
          result = result

      println(s"The Alternate even numbers are $result")
    }
    findAltEven(range1)
    findAltEven(range2)
  }


}
