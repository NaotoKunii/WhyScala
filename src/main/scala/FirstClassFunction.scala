/**
 * 第一級関数（first-class function）
 */
object FirstClassFunction extends App {
  def add(x : Int, y: Int) = x + y
  def divide(x: Double, y: Double) = x / y

  // 関数を関数の引数として扱える
  println (divide( add(4, 3), add(1, 2) ))
}
