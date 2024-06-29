/*
4. Write a java program that performs the following tasks.
a. Store a number in a variable
b. If value is not in range (100-1000) prints wrong number else follows
the steps
c. Check even or odd
d. If even divide the number by 3 and print the remainder
e. If odd divide the number by 2 and print the remainder.
 */

object Task_4 {

  def main(args:Array[String]):Unit={
    val a = 9
    val b = 200

    def checkTask(n:Int):Unit={
      if( (n>100) && (n<1000))
        if( n%2==0)
          println(s"$n is in range (100,1000), even and remainder when divided by 3 is " + n%3)
        else
          println(s"$n is in range (100,1000), odd and remainder when divided by 2 is " + n%2)
      else
          println(s"$n is wrong number")
        }
    checkTask(a)
    checkTask(b)
    }
  }


