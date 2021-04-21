package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

  def factorial(n : Int) : Int =
    if(n <= 1) 1
    else {
      println("Computing factorial of " + n + "- I first need factorial of " + (n-1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))

  def newFactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt) : BigInt =
      if(x <= 1) accumulator
      else factorialHelper(x -1, x * accumulator ) // TAIL RECURSION = use Recursive call as the last expression

    factorialHelper(n, 1)
  }

  println(newFactorial(5000))

  // WHEN YOU NEED LOOPS, USE_TAIL_RECURSION

  /*
  1. Concatenate a string n times
  2. isPrime function tail recursive
  3. Fibonacci function, tail recursive
   */

  def functionOne(something: String, n: Int, accumulator: String): String = {
    if(n < 1) accumulator
    else functionOne(something, n -1, something + accumulator)
  }

  println(functionOne("Brandon", 10, ""))

  def functionTwo(i: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      else if(t <= 1) true
      else isPrimeUntil(t - 1, i % t != 0 && isStillPrime )
    }

    isPrimeUntil(i/2, true)
  }

  println(functionTwo(3))
  println(functionTwo(4))
  println(functionTwo(5))
  println(functionTwo(6))
  println(functionTwo(7))

  def functionThree(n : Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast:Int): Int =
      if(i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if(n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

  println(functionThree(8)) // 1 1 2 3 5 8 13, 21



}
