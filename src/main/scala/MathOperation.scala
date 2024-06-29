/*
6. Write a program to perform simple math based on the user inputs by using Switch condition.
User Input -> (+ , - , * , /)
 */

object MathOperation {
  def main(args:Array[String]):Unit={
    val a = (30,10)
    val user1='+'
    val user2='*'
    val user3='/'
    val user4='-'

    def UserMathOperations( a:Char, b:(Int,Int)):Unit={
      a match {
        case '+' => println("Sum is "+ (b._1+b._2))
        case '-' => println("Subtraction is "+ (b._1-b._2))
        case '*' => println("Multiplication is "+ (b._1*b._2))
        case '/' => println("Division is "+ (b._1/b._2))
        case _   => println("Invalid Math operation")
      }
    }
    UserMathOperations(user1,a)
    UserMathOperations(user2,a)
    UserMathOperations(user3,a)
    UserMathOperations(user4,a)
  }

}
