package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object FineCalculator {
  def calculateFine(days: Int): Float = {
    days match {
      case days if days <= 7 => 0
      case days if days <= 12 => 1.2f * (days - 7)
      case days if days > 12 && days <= 22 => (1.75f * (days - 12)) + (1.2f * 5)
      case _ => 1000
    }
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the days :")
    val days = scala.io.StdIn.readLine().toInt
    println(s"Fine to pay: ${calculateFine(days)}")
  }

}
