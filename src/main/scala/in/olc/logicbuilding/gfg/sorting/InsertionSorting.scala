package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.sorting

import in.olc.logicbuilding.gfg.utils.*
object InsertionSorting {

  def insertionSort(arr:Array[Int])={
    def outerLoop(i:Int):Array[Int]={
      def innerLoop(j:Int):Array[Int]={
        if j<1 then
          arr
        else if arr(j)>arr(j-1) then
          arr
        else
          Utils.swapElements(arr,j,j-1)
          innerLoop(j-1)
      }
      if i>arr.length-1 then
        arr
      else
        innerLoop(i)
        outerLoop(i+1)
    }
    outerLoop(1)
  }

  def main(args: Array[String]): Unit = {
    //val arr=Array(12, 11, 13, 5, 6)
    val arr=Array(4,5,1,2,3)
    println(insertionSort(arr).toList.toString())
  }

}
