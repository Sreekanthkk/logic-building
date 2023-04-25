package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object BillGenerator {
  def generateBill(units: Int): Float = {
    units match {
      case units if units <= 100 => 200 + (1.20f * units)
      case units if units > 100 && units <= 150 => 200 + (2.50f * units)
      case units if units > 150 && units <= 400 => 200 + (4f * units)
      case units if units > 400 => 200 + (5.50f * units)
      case _ => 0
    }
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the units consumed:")
    val units = scala.io.StdIn.readLine().toInt
    println(generateBill(units))
  }

}
