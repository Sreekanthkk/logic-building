package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.searchalgorithms

import scala.annotation.tailrec

object BinarySearch {

  def binarySearch(arr:Array[Int],x:Int):Int={
    def helper(start:Int,end:Int):Int={
      val m=start+(end-start)/2
      if start>end then -1
      else if arr(m)==x then m
      else if x > arr(m) then helper(m+1,end)
      else helper(start,m-1)
    }
    helper(0,arr.length-1)
  }

  def main(args: Array[String]): Unit = {
    val arr=Array(2, 5, 8, 12, 16, 23, 38, 56, 72, 91)
    println(binarySearch(arr,23))
  }
}
