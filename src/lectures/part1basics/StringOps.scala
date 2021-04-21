package lectures.part1basics

object StringOps extends App{

  val str: String = "Hello, I am learning scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length())

  val aNumberString = "45"
  val aNumber = aNumberString.toInt

  println('a' +: aNumberString :+ 'z')
  println(str.reverse)

  // Scala-specific: String interpolators

  // s-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, My name is $name and i am $age years old"
  val greeeting = s"Hello, My name is $name and i am ${age + 1} years old"

  println(greeeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw-interpolator
  println(raw"this os a \n newLine")
  val escape = "this os a \n newLine"
  println(raw"$escape")

}
