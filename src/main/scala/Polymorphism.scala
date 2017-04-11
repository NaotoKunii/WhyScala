/**
  * 多相性
  */
object Polymorphism extends App {

  def listHead[A](list: List[A]): A = list(0)

  val prius = new Car("PRIUS")
  val civic = new Car("Civic")
  val skyline = new Car("SKYLINE")

  val intList = List(1, 2, 3, 4, 5)
  val strList = List("AB", "CD", "EF")
  val carList = List(prius, skyline, civic)

  println( listHead(intList) )
  println( listHead(strList) )
  println( listHead(carList) )
}

class Car(val name: String){
  override def toString: String = name
}
