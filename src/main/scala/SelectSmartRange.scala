/*
5. Declare & initialize a number.
Check whether the number is in range 0-100 or not.
If not in range print invalid input. Else –
if the number is in range 90- 100 then print Super Smart,
80-90 print Smart,70-80 print smart enough,
60-70 print just smart,
35-60 print no smart,
0-35 print dump.
 */

object SelectSmartRange {
  def main(args: Array[String]): Unit = {
    val num1 = 200
    val num2 = 60
    val num3 = 90

    def checkRange(n: Int): Unit = {
      n match {
        case n if n < 0  || n > 100 => println(s"$n is an invalid input ")
        case x if x > 90 && x <= 100 => println(s"$x is Super Smart ")
        case x if x > 80 && x <= 90 => println(s"$x is Smart ")
        case x if x > 70 && x <= 80 => println(s"$x is Smart Enough ")
        case x if x > 60 && x <= 70 => println(s"$x is Just Smart ")
        case x if x > 35 && x <= 60 => println(s"$x is No Smart ")
        case x if x >= 0 && x <= 35 => println(s"$x is dump ")
        case _ => println(s"$n is wrong")
      }
    }
    checkRange(num1)
    checkRange(num2)
    checkRange(num3)
    }


}
