package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object AverageMarks {
  def getAverage(mark1: Int, mark2: Int): Int = {
    (mark1 + mark2) / 2
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the mark1 and mark2:")
    val marks = scala.io.StdIn.readLine().split(",")
    val avg = getAverage(marks(0).toInt, marks(1).toInt)
    if (avg >= 90)
      println("Very good")
    else
      println("Work hard")
  }

}
