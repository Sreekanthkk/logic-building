package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.sorting

object BubbleSorting {

  def bubbleSort(arr:Array[Int])={
    val length=arr.length
    def helper1(i:Int):Array[Int]={
      def helper2(j:Int):Array[Int]={
        j match{
          case j if j>=length-i => arr
          case j if arr(j)<arr(j-1) =>{
            val temp=arr(j)
            arr.update(j,arr(j-1))
            arr.update(j-1,temp)
            helper2(j+1)
          }
          case _ => helper2(j+1)
        }
      }
      i match {
        case i if i> length-1 => arr
        case _ => {
          helper2(1)
          helper1(i+1)
        }
      }
    }
    helper1(0)
  }

  def main(args: Array[String]): Unit = {
    val arr=Array(6, 3, 0, 5)
    println(bubbleSort(arr).toList.toString())
  }

}
