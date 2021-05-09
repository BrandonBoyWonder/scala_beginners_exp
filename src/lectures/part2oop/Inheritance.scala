package lectures.part2oop

object Inheritance extends App {

  // single class inheritance
  sealed class Animal {
    val creatureType = "Wild"
    def eat = println("nom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("Crunch")
    }
  }
  val cat = new Cat
  cat.crunch

  // constructor
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  //Overriding
  class Dog(override val creatureType: String) extends Animal {
//    override val creatureType: String = "Domestic"
    override def eat: Unit = {
      super.eat
      println("Crunch crunch")
    }
  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution (polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  //Overridding vs overloading

  // super

  //perventing overrides
  //1 - use keyword final on member
  //2- use final on class
  //3 - seal the class = extend classs in this files, prevent extends in anotherfile

}
