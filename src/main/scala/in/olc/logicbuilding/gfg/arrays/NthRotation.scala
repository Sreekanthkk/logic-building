package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.arrays

object NthRotation {

  def rotate(arr:Array[Int],r:Int)={
    def helper(arr:Array[Int],start:Int,end:Int):Array[Int]={
      start match{
        case start if start>=end => arr
        case _ => {
          val temp=arr(start)
          arr(start)=arr(end)
          arr(end)=temp
          helper(arr,start+1,end-1)
        }
      }
    }
    val n=arr.length
    val d=r%n
    helper(arr,0,d-1)
    helper(arr,d,n-1)
    helper(arr,0,n-1)
  }

  def main(args: Array[String]): Unit = {
    val arr=Array(1, 2, 3, 4, 5, 6, 7)
    println(rotate(arr,2).toList.toString())
  }

}
