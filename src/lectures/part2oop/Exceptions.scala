package lectures.part2oop

object Exceptions extends App {

  val x: String = null
  // throwing and catching exception

// val weirdValue =  throw new NullPointerException

  // throwable classes extends Throwable class
  // Exceptions and Error are the major subtypes class

  //2. how to catchException
  def getInt(withException: Boolean): Int =
    if(withException) throw new RuntimeException("No Int for you")
    else 42

 val somethingError = try{
    getInt(true)
  }catch {
    case e: RuntimeException => println("Got an Error")
  } finally {
    // code get executed no matter what
   // optional
   // does not influence the return type use only for side effects
    println("finally")
  }

//  3. how to define your own exceptions
  class MyException extends Exception
  val exceptions = new MyException
  throw exceptions

  /*
  1. Crash your progam with an OutOfMemoryError
  2. crash with stackOverflow
  3. pocketCalculator
  - Add
  -subtract
  multiply
  divide
   */
}
