package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object EvenOrOdd {
  def evenOrOdd(number: Int): Boolean = {
    if ((number % 2) == 0)
      true
    else
      false
  }

  def main(args: Array[String]): Unit = {
    println(evenOrOdd(3458));
  }

}
