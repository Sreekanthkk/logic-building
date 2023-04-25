package in.olc.logicbuilding
package in.olc.logicbuilding.medium

object SwapNumbersv1{

def swapNumbersv1(a:Int,b:Int):(Int,Int)= {
  println(s"a=$a,b=$b")
  (b,a)
}

def main(args: Array[String]): Unit = {
  //(a:Int,b:Int)=swapNumbers(5,6)
  val (a,b)=swapNumbersv1(5,6)
    println(s"a=$a,b=$b")
}

}
