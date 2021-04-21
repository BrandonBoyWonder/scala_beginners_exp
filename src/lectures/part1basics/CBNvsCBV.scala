package lectures.part1basics

object CBNvsCBV extends App {
  def calledByValue(x: Long): Unit = {
    println("by Value: " + x)
    println("by Value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by Name: " + x)
    println("by Name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)
  printFirst(34, infinite())
}
