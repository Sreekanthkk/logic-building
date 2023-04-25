package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object MessageDisplay {

  def messageDisplay(num: Int): String = {
    num match {
      case 1 => "I can dance"
      case 2 => "I can sing"
      case 3 => "I can swim"
      case _ => "Sorry wrong input"
    }
  }

  def main(args: Array[String]): Unit = {
    var isRunning = true;
    while (isRunning) {
      println("Please enter your choice: \n1. I can dance\n2. I can sing\n13. I can swim ")
      val choice = scala.io.StdIn.readLine().toInt
      println(messageDisplay(choice))
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
