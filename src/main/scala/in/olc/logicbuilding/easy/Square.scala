package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object Square {
  def area(length: Int): Int = {
    length * length
  }

  def perimeter(length: Int): Int = {
    4 * length
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the length and breadth:")
    val length = scala.io.StdIn.readLine().toInt
    println(s"Area: ${area(length)}")

    println(s"perimeter: ${perimeter(length)}")
  }
}
