package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object GtandLt3Numbers {
  def max(a: Int, b: Int): Int = {
    if a == b then a
    if (a > b)
      a
    else
      b
  }

  def min(a: Int, b: Int): Int = {
    if a == b then a
    if (a < b)
      a
    else
      b
  }

  def printGtandLt(a: Int, b: Int, c: Int): String = {
    if (a == b && b == c) {
      s"Given numbers are same: $a"
    } else {
      val largest = max(a, max(b, c))
      val lowest = min(a, min(b, c))
      s"Min: $lowest and Max: $largest"
    }

  }

  def main(args: Array[String]): Unit = {
    println("Please enter the numbers: a,b,c ")
    val numbers = scala.io.StdIn.readLine().split(",")
    println(printGtandLt(numbers(0).toInt, numbers(1).toInt, numbers(2).toInt))
  }

}
