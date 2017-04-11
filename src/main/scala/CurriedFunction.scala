/**
  * カリー化
  */
object CurriedFunction extends App {
  val add = (x:Int, y:Int, z:Int) => x + y + z
  val addCurried = add.curried
  println(addCurried(1)(2)(3))
}
