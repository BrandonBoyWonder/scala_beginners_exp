package lectures.part2oop

object caseClasses extends App {

  /*
   equals, hashcode, tostring
   */

  case class Person(name: String, age: Int)

  //1. class parameters are fieilds
  val jim = new Person("Jim", 25)
  println(jim.age)

  //2. sensible toString
  println(jim.toString)

  // 3  equals and hascode implemented out of the box
  val jum2 = new Person("Jim", 25)
  println(jum2==jim)

  // 4. handy copy methods
  val jim3 = jim.copy(age=45)
  println(jim3)

  //5. case classes have companion object
  val thePerson = Person
  val mary = Person.apply("Mary", 23)

  // 6.case class are seriliazable
  // Akka

  // 7. case classes have extractor patterns = can be used in pattern matching

  case object UnitedKingdom {
    def name: String = "The UK"
  }

  /*
   Expand MyList
   */
}
