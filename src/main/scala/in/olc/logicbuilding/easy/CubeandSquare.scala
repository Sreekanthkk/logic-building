package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object CubeandSquare {
  def square(num: Int): Int = {
    num * num
  }

  def cube(num: Int): Int = {
    num * square(num)
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the number:")
    val number = scala.io.StdIn.readInt()
    println(s"Square: ${square(number)}")
    println(s"cube: ${cube(number)}")
  }

}
