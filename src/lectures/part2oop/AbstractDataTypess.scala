package lectures.part2oop

object AbstractDataTypess extends App{

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }
  class Dog extends Animal {
    override val creatureType: String = "Canine"

    override def eat: Unit = println("Crunch Crunch")
  }

  // traits
  trait Carnivore {
    def eat(animal: Animal) : Unit
    val perfMeat: String = "fresh meat"
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "Croc"

    override def eat: Unit = println("NOmNOmNom")

    override def eat(animal: Animal): Unit = println(s"im a croc and eating ${animal.creatureType}")
  }

  val dog = new Dog
  val crocodile = new Crocodile

  crocodile.eat(dog)

  //taits vs abstract
  //1- traits - do not contrustor params
  //2 - multiple traits can be inherited by the same class
  //3 - traits = behavior, abstract class = ":thing
}
