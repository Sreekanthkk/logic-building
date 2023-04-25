package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object Grade {
  def defineGrade(marks: Array[Int]): String = {
    val average = marks.sum / marks.length
    average match {
      case average if average >= 90 => s"Average: ${average} ,Grade A"
      case average if average >= 70 && average < 90 => s"Average: ${average} ,Grade B"
      case average if average >= 40 && average < 70 => s"Average: ${average} ,Grade C"
      case average if average < 40 => s"Average: ${average} ,Grade E"
    }
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the marks each separated by \",\":")
    val data = scala.io.StdIn.readLine().split(",")
    val marks = data.map(x => x.toInt)
    println(defineGrade(marks));
  }

}
