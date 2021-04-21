package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION

  println(x)

  println(2+3*4)
  // + - * / & | ^ << >> >>> (right shift with Zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  //  ! && ||

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // Instruction (DO) vs Expressions  (VALUE)

  // IF Expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // If Expression
  println(aConditionValue)

  var i = 0
  while (i < 10){
    println(i)
    i +=1
  }

  // NEVER WRITE THIS AGAIN

  // Everything in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. difference between " hello world" vs println ("hello world)?

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

}
