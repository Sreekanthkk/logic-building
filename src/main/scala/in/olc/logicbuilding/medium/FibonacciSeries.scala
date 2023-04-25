package in.olc.logicbuilding
package in.olc.logicbuilding.medium

object FibonacciSeries extends App{
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
  def printFibonacciSeries(limit:Int):List[Int]={
    def iterator(num:Int,acc:List[Int]):List[Int]={
      if num>limit then acc
      else {
        if num==0 then
          iterator(1,1::acc)
        else
          val next=acc.head+acc.tail.head
          iterator(next,next::acc)
      }
    }
    iterator(0,0::Nil)
  }
  def fiboTailRecursive(n: Int): Int = {
    def recursion(n: Int, a: Int, b: Int): Int = {
      if (n > 0) recursion(n - 1, b, a + b)
      else a
    }
    recursion(n, 0, 1)
  }
  println(printFibonacciSeries(100))
  println(fiboTailRecursive(6))
}
