/*
1. Write a program to convert kg to g. (Input 56kg print in grams)
*/

object ConvertKgToG {

  def main(args:Array[String]):Unit={

    def convertToGram(w:Int):Int={
      return w*1000
    }
    val w1 = 6
    val w2 = 10
    println(s"$w1 kg in gram is "+ convertToGram(w1))
    println(s"$w2 kg in gram is "+ convertToGram(w2))

  }
}
