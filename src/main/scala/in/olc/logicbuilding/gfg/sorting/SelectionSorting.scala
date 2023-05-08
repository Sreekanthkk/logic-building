package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.sorting
import in.olc.logicbuilding.gfg.utils.*

object SelectionSorting {

  def selectionSort(arr:Array[Int])={
    def helper(startIndex:Int,counter:Int):Array[Int]={
      val endIndex=arr.length-counter-1
      endIndex match {
        case endIndex if endIndex<=startIndex => arr
        case _ =>{
          val largestIndex=Utils.largestEleIndRange(arr,0,endIndex)
          Utils.swapElements(arr,largestIndex,endIndex)
          //helper(startIndex+1)
          helper(0,counter+1)
        }
      }
    }
    helper(0,0)
  }

  def main(args: Array[String]): Unit = {
    val arr=Array(64, 25, 12, 22, 11)
    println(selectionSort(arr).toList.toString())
  }
}
