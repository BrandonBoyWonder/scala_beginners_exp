package exercises

object OOBasicExercise extends App{
  val writer = new Writer("brandon", "moore", 1994)
    println(writer.fullName())
  val novel = new Novel("Mushoko Tensei", 2014, writer)
    println(novel.authorAge())
    println(novel.isWrittenBy(writer))
    println(novel.toString)
    println(novel.copy(2020).toString)

}

class Writer(firstName: String, surname: String, val year: Int){
    def fullName(): String = s"Full Name: $firstName $surname"

  override def toString: String = fullName()
}

class Novel(name: String, yor: Int, author: Writer){
  def authorAge(): Int =  if(yor > author.year) yor - author.year else -1

  def isWrittenBy(author: Writer) : Boolean = author == this.author

  def copy (yor: Int) : Novel = new Novel(name, yor, author)

  override def toString: String = s"$name | $yor | $author"
}

class Counter(i: Int) {
  def currentCount : Int = i
  def incrementCount : Counter = new Counter(i+1)
  def incrementCount(i: Int) : Counter = {
    if(i <= 0) this
    else incrementCount.incrementCount(i-1)
  }


  def decrementCount : Counter = new Counter(i-1)
  def decrementCount(i: Int) : Counter = new Counter(this.i-i)
}


