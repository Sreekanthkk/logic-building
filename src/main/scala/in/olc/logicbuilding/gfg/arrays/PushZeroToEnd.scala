package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.arrays

object PushZeroToEnd {
  def pushZerosToEnd(a:Array[Int])={
    var j=0
    for(i<-0 until a.length){
      if a(i)!=0 then
        swap(a,i,j)
        j+=1
    }
    a
  }
  def swap(a:Array[Int],i:Int,j:Int)={
    val temp=a(j)
    a(j)=a(i)
    a(i)=temp
  }

  def main(args: Array[String]): Unit = {
    println(pushZerosToEnd(Array( 5, 6, 0, 4, 6, 0, 9, 0, 8)).toList.toString())
  }

}
