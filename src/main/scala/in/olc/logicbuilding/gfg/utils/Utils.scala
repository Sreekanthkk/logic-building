package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.utils

object Utils {
  def swapElements(arr:Array[Int],pos1:Int,pos2:Int)={
    val temp=arr(pos1)
    arr.update(pos1,arr(pos2))
    arr.update(pos2,temp)
  }
  def largestEleIndRange(arr:Array[Int],start:Int,end:Int)={
    //val largestIndex=start
    def helper(index:Int,largestIndex:Int):Int={
      largestIndex match{
        case largestIndex if index>=end => largestIndex
        case largestIndex if arr(largestIndex)< arr(index+1) => helper(index+1,index+1)
        case _ => helper(index+1,largestIndex)
      }
    }
    helper(start,start)
  }
}
