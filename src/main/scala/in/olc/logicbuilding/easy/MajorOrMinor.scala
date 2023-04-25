package in.olc.logicbuilding
package in.olc.logicbuilding.easy

import java.util.Scanner

object MajorOrMinor {
  def major(age: Int): String = {
    if (age > 18)
      "Major, age is greater than 18."
    else
      "Minor, age is less than or equal to 18."
  }

  def main(args: Array[String]): Unit = {

    var sc = new Scanner(System.in);
    while (true) {
      println("1. Please enter your age: ")
      val age = sc.nextInt()
      println(major(age))

    }

  }

}
