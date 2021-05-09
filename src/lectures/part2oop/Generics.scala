package lectures.part2oop

object Generics extends App {

  class MyList[+A] {
    // use the type A
    def add[B >: A](el: B): MyList[B] = ???
    /*
    a = CAT
    b= DOG = ANIMAL

     */
  }

  class MyMap[key, value]

  val listInt = new MyList[Int]
  val listString = new MyList[String]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog)??? HARD QUESTION == returns a list of Animals

  // 2. No = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, No! - CONTRAVARIANCE
  class ContraVariantList[-A]
  val contraVariantList: ContraVariantList[Cat] = new ContraVariantList[Animal]

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal](animal: A) // UPPER BOUNDED
  val cage = new Cage(new Dog)

  class CageLower[A >: Animal](animal: A) // LOWER BOUNDED
//  val cageLower = new CageLower(new Dog)

  // expand MyList to be Generic
}
