package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.arrays

object TwoPointer {
//array.update()
  def rearrangeArray(a:Array[Int])={
    var first=0
    var last=a.length-1
    val target=new Array[Int](a.length)
    for(i<-0 until(a.length)){
      if i%2==0 then
        target(i)=a(last)
        last-=1
      else
        target(i)=a(first)
        first+=1
    }
    target
  }
  def main(args: Array[String]): Unit = {
    println(rearrangeArray(Array(1, 2, 3, 4, 5, 6, 7)).toList.toString())
  }

}
