package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object SimpleInterestCalculator {
  def calculateInterest(principle: Float, tenure: Int, interest: Float): Float = {
    ((principle * tenure * interest) / 100).toFloat
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the principle,tenure and interest in %(keep the same order):")
    val data = scala.io.StdIn.readLine().split(",")
    println(s"Interest is: ${calculateInterest(data(0).toFloat, data(1).toInt, data(2).toFloat)}")
  }

}
