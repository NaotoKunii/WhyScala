/**
  * 副作用のない関数
  */
object NoSideEffect extends App{

  // 副作用のある関数
  var x:Int = 0
  def sideEffectAdd(y:Int):Int = {
    x += y
    x
  }

  // 副作用のない関数
  def noSideEffectAdd(x: Int) = x + 5

  println(s"sideEffectAdd：${sideEffectAdd(1)}")
  println(s"sideEffectAdd：${sideEffectAdd(1)}")
  println(s"sideEffectAdd：${sideEffectAdd(1)}")

  println(s"noSideEffectAdd：${noSideEffectAdd(1)}")
  println(s"noSideEffectAdd：${noSideEffectAdd(1)}")
  println(s"noSideEffectAdd：${noSideEffectAdd(1)}")
}
