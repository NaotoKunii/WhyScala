/**
  * 関数合成
  */
object FunctionComposition extends App {

  val square = (x: Int) => x * x
  val increment = (x: Int) => x + 1
  // 右辺から評価
  println( (square compose increment)(2) )
  // 左辺から評価
  println( (square andThen increment)(2) )
}
