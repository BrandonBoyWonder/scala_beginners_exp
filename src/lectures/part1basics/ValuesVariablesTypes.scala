package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x = 42;
  println(x);

  // VALS ARE IMMUTABLE

  // compiler can infer types

  val aString: String = "Hello"
  val otherString = "GoodBye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x;
  val aShort: Short = 4613
  val aLong : Long = 562812653L
  val aFloat: Float = 2.0F
  val aDouble: Double = 3.14

  // Variables
  var aVariable: Int = 4;

  aVariable = 5 // Side effects
}
