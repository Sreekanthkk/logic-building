package in.olc.logicbuilding
package in.olc.logicbuilding.medium
import java.util.Scanner

object SwapNumbersV2 extends App{
  println("enter two numbers")
  var sc= Scanner(System.in)
  var a=sc.nextInt()
  var b=sc.nextInt()
  println("Before swapping:")
  println(s"a=$a,b=$b")
  a=a+b
  b=a-b
  a=a-b
  println("After swapping:")
  println(s"a=$a,b=$b")
}
