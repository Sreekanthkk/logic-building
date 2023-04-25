package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object DayPrinter {

  def printDay(num: Int): String = {
    num match {
      case 1 => "Monday"
      case 2 => "Tuesday"
      case 3 => "Wednesday"
      case 4 => "Thursday"
      case 5 => "Friday"
      case 6 => "Saturday"
      case 7 => "Sunday"
      case _ => "Please provide a valid input!"
    }
  }

  def main(args: Array[String]): Unit = {
    var isRunning = true;
    while (isRunning) {
      println("Please enter your choice: \n1. Monday" +
        "\n2.Tuesday" +
        "\n3.Wednesday" +
        "\n4.Thursday" +
        "\n5.Friday" +
        "\n6.Saturday" +
        "\n7.Sunday")
      val choice = scala.io.StdIn.readLine().toInt
      println(printDay(choice))
      println("Do you like to continue: Yes/no")
      val prompt = scala.io.StdIn.readLine().toLowerCase()
      prompt match {
        case "yes" => isRunning = true
        case "no" => isRunning = false
        case _ => println("Please enter a valid input(Yes/No")
      }

    }
  }
}
