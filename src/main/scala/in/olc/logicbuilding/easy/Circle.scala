package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object Circle {
  def area(radius: Int): Float = {
    3.14f * radius * radius
  }

  def circumference(radius: Int): Float = {
    2 * 3.14f * radius
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the radius:")
    val radius = scala.io.StdIn.readLine().toInt
    println(s"Area: ${area(radius)}")

    println(s"circumference: ${circumference(radius)}")
  }
}
