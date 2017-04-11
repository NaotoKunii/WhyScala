/**
  * 部分適用
  */
object PartialApplication extends App {
  def add3Param(x: Int, y: Int, z:Int) = x + y + z
  val add10 = add3Param(_:Int, _:Int, 10)
  println(add10(5, 10))
}
