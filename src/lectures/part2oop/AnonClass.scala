package lectures.part2oop

object AnonClass extends App {

  abstract class Animal {
    def eat: Unit


  }

  // anon class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit =println("Ahahahahahaha")
  }

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"hi, $name")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"hi, Jim")
  }

  /*
  1.  Generic trait MyPredicate[-T] with a little method test(T) => Boolean
  2.  Generic trait MyTransformer[-A, B] with a method transform(A) => B
  3.  MyList:
      - map(transformer) => MyList
      - filter(predicate) => MyList
      - flatMap(transformer from A to MyList[B]) => MyList[B]
      class EvenPredicate extends MyPredicate[Int]
      class StringToIntTransformer extends MyTransformer[String, Int]
      [1,2,3].map(n * 2) = [2,4,6]
      [1,2,3,4].filter(n % 2) = [2,4]
      [1,2,3].flatMap(n => [n, n+1]) => [1,2,2,3,3,4]
 */
}
