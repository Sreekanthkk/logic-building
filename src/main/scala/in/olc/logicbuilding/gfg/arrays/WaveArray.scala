package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.arrays

object WaveArray {

  def swap(arr:Array[Int],i:Int,j:Int)={
    val temp=arr(i)
    arr(i)=arr(j)
    arr(j)=temp
  }
  // This function sorts arr[0..n-1] in wave form, i.e.,
  // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
  //List(90, 10, 49, 1, 2, 5, 23)
  def wave(arr:Array[Int])={
    val n=arr.length
    def helper(arr:Array[Int],index:Int):Array[Int]={
      index match{
        case index if index >=n-1 => arr
        case _ =>{
          if index>0 && arr(index-1)> arr(index) then
            swap(arr,index,index-1)
          else if index< n-1 && arr(index)<arr(index+1) then
              swap(arr,index,index+1)
          helper(arr,index+2)
        }
      }
    }
    helper(arr,0)
  }

  def main(args: Array[String]): Unit = {
    println(wave(Array(10, 90, 49, 2, 1, 5, 23)).toList.toString())
  }
}
