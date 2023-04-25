package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object Smallest {
  def smallest(a: Int, b: Int, c: Int): Int = {
    if (a == b && b == c)
      a
    if (a < b)
      if (c < a)
        c
      else
        a
    else if (c < b)
      c
    else
      b
  }

  def main(args: Array[String]): Unit = {
    println("Please enter three numbers(1,2,3):")
    val numbers = scala.io.StdIn.readLine().split(",")
    println(smallest(numbers(0).toInt, numbers(1).toInt, numbers(2).toInt))
  }
}
