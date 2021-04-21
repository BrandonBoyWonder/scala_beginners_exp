package lectures.part1basics

object Functions extends App {

  def aFunction (a: String, b:Int) = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  def aParameterlessFunction (): Int = 42
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello11", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String) : Unit = println(aString)

  def aBigFunction(n: Int) : Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
    1. A Greeting function (name, age) +> "Hi my name is ${name} and i am %{age} years old
    2. Factorial function 1 * 2 * 3 .. * n
    3. a Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n -1) + f(n - 2)

      4. Tests if number is prime
   */

  def functionOne(name: String, age:Int) : String = "Hi my name is " + name + " and i am " + age + " years old"

  def factorial(n: Int) : Int = {
    if(n  <= 0) 1
    else n * factorial(n - 1)
  }

  def fibonacci (n: Int): Int = {
    if(n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  def isPrime(n: Int) : Boolean = {
    def isPrimeUntil(t: Int) : Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t -1)

    isPrimeUntil(n / 2)
  }



}
