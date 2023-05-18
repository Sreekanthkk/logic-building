package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.sorting

import in.olc.logicbuilding.gfg.utils.*

import scala.annotation.tailrec

object QuickSorting {

  def quicksort(arr:Array[Int])={
    def iterator1(start:Int,end:Int):Array[Int]={
      val m=start+(end-start)/2
      //val m=end
      val pivot=arr(m)
      @tailrec
      def iterator2(sp:Int,ep:Int ):Array[Int]={
        sp match{
          case sp if sp<=ep =>{
            if arr(sp)>=pivot then
              if arr(ep)<=pivot then
                if sp<=ep then
                  Utils.swapElements(arr,sp,ep)
                  iterator2(sp+1,ep-1)
                else
                  arr
              else
                iterator2(sp,ep-1)
            else
              iterator2(sp+1,ep)
          }
          case _ => arr
        }

      }
      if start>=end then
        arr
      else
        iterator2(start,end)
        if start<m then
          iterator1(start,m)
          if m+1 < end then
            iterator1(m+1,end)
          else
            arr
        else
          iterator1(m+1,end)
    }
    iterator1(0,arr.length-1)
  }

  def main(args: Array[String]): Unit = {
    //println(quicksort(Array(5,4,3,2,1)).toList.toString())
    println(quicksort(Array(10,80,30,90,40,50,70)).toList.toString())
  }

}
