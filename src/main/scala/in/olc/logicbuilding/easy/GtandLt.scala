package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object GtandLt {
  def printGtandLt(a: Int, b: Int): String = {
    if (a == b)
      s"The smallest :$a and the Greatest :$a"
    else if (a < b)
      s"The smallest :$a and the Greatest :$b"
    else
      s"The smallest :$b and the Greatest :$a"
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the numbers: a,b ")
    val numbers = scala.io.StdIn.readLine().split(",")
    println(printGtandLt(numbers(0).toInt, numbers(1).toInt))
  }

}
