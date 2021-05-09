package lectures.part2oop

object Objects {

  // SCALA DOES NOT hAVE CLASS_LEVEL FUNCTIONALITY("static")

  object Person {
    // "static/class" - level functionality
    val N_EYE = 2
    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person(val name: String) {
    // instance-level functionality
  }

  // COMPANIONS

  def main(args: Array[String]) : Unit ={
    println(Person.N_EYE)
    println(Person.canFly)

    //Scala object = SINGLETON INSTANCE
    val mary = new Person("Mary")
    val john = new Person("John")
    println(mary == john)

    val Person1 = Person
    val Person2 = Person
    println(Person1 == Person2)

    val bobbie = Person(mary, john )


  }
  // scala Applications = scala object with
  // def main(args: Array[String]) : Unit


}
