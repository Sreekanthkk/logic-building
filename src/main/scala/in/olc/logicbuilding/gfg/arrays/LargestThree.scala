package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.arrays

object LargestThree {
  def doReturnLargestThree(arr:Array[Int])={
    if(arr.length<3) then println("Invalid input")
    var first=Int.MinValue
    var second=Int.MinValue
    var third=Int.MinValue
    for(i<- 0 until arr.length){
      if(arr(i)>=first) then
        third=second
        second=first
        first=arr(i)
      else if(arr(i)>=second) then
        third=second
        second=arr(i)
      else if(arr(i)>=third) then
        third=arr(i)
    }
    println(s"$first,$second,$third")
  }

  def main(args: Array[String]): Unit = {
    doReturnLargestThree(Array(45,34,76,3,98,12,67,89))
  }
}
