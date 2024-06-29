/*
2. Write a program to covert temperature from degree C to F. (Input 80C)
(80°C × 9/5) + 32 = 176°F
 */

object CelciusToFerenheit {
  def main(args:Array[String]):Unit={
    val cel1 = 40
    val cel2 = -40

    def convertCtoF(c:Int):Unit={
      println(s"Celcius $c is equal to Fahrenheit " + (((c*9)/5) +32) )
    }
     convertCtoF(cel1)
     convertCtoF(cel2)
  }

}
