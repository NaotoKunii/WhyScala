/**
  * 再帰処理
  */
object Recursive extends App {

  def factorial(x: Int, acc: BigInt = 1): BigInt = x match {
    case 0 => acc
    case _ => factorial(x - 1, x * acc)
  }
  println( factorial(4) )
}
