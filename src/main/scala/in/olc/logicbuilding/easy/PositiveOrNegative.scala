package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object PositiveOrNegative {
  def positiveOrNegative(num: Int): String = {
    if (num == 0)
      "Zero"
    else if (num > 0)
      "Positive"
    else
      "Negative"
  }

  def main(args: Array[String]): Unit = {
    println(positiveOrNegative(4))
    println(positiveOrNegative(-2))
    println(positiveOrNegative(0))
  }
}
