package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.arrays

object NthRotationOpt {

  def rotate(arr:Array[Int],k:Int)={
    val n=arr.length
    val newArr=new Array[Int](arr.length)
    def helper(arr:Array[Int],i:Int):Array[Int]={
      val d=k%n
      i match {
        case i if i>=n => newArr
        case _ => {
          //print(s"${arr((i+d)%n)} ")
          newArr.update(i,arr((i+d)%n))
          /*val temp=arr(i)
          val rotIndex=(i+d)//%n
          if(rotIndex>=n)
            arr.update(i,arr(rotIndex-1))
            arr.update(rotIndex-1,temp)
          else
            arr.update(i,arr(rotIndex))
            arr.update(rotIndex,temp)*/
          helper(arr,i+1)
        }
      }
    }
    helper(arr,0)
  }

  def main(args: Array[String]): Unit = {
    println(rotate(Array(1, 3, 5, 7, 9),2).toList.toString())
    println(rotate(Array(1, 3, 5, 7, 9),3).toList.toString())
    println(rotate(Array(1, 3, 5, 7, 9),4).toList.toString())
  }
}
