package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object Rectangle {
  def area(length: Int, breadth: Int): Int = {
    length * breadth
  }

  def perimeter(length: Int, breadth: Int): Int = {
    2 * (length + breadth)
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the length and breadth:")
    val numbers = scala.io.StdIn.readLine().split(",")
    println(s"Area: ${area(numbers(0).toInt, numbers(1).toInt)}")

    println(s"perimeter: ${perimeter(numbers(0).toInt, numbers(1).toInt)}")
  }
}
