package in.olc.logicbuilding
package in.olc.logicbuilding.easy

object CelsiusToF {
  def converter(celsius: Int): Float = {
    val farhenheit = ((celsius * 9 / 5) + 32).toFloat
    farhenheit
  }

  def main(args: Array[String]): Unit = {
    println("Please enter the temperature in Celsius:")
    val celsius = scala.io.StdIn.readLine().toInt
    println(converter(celsius))
  }
}
