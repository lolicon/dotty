import Macros._
object Test {
  def main(args: Array[String]): Unit = {
    println(foo { // error
      val x = 5
      x
    })
  }
}
