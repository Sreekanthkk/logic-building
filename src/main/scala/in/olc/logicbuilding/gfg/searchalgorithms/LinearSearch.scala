package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.searchalgorithms

object LinearSearch {
  def linearSearch(arr:Array[Int],x:Int):Boolean={
    val length=arr.length
    def helper(a:Array[Int],index:Int):Boolean={
      if index>=length then
        false
      else if x==a(index) then
        true
      else
        helper(a,index+1)
    }
    helper(arr,0)
  }

  def main(args: Array[String]): Unit = {
    val arr=Array( 2, 3, 4, 10, 40 );
    println(linearSearch(arr,0))
  }
}
