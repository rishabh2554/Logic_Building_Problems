/*
15. Print following series 2*3,3*4,4*5,......16*17 (Print in two ways – patter
& multiplied value)
 */

object PrintPattern {

  def main(args:Array[String]):Unit={

    val endValue1 = 10
    val endValue2 = 19

    def designPattern(value:Int):Unit={
      var result = ""
      var resultMul = ""
      for ( i <- 2 to value) {
        if(i==value){
          result = result + i + '*' + (i + 1)
          resultMul = resultMul + (i * (i + 1))
      }
        else
      {
        result = result + i + '*' + (i + 1) + ','
        resultMul = resultMul + (i * (i + 1)) + ','
      }
      }
      println(s"The pattern is $result")
      println(s"The multiplication pattern is $resultMul")
      println()
    }
    designPattern(endValue1)
    designPattern(endValue2)

  }

}
