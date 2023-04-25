package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.arrays

object SecondLargest {

  def secondLargest(arr:Array[Int])=
    if arr.length<2 then Int.MinValue
    var first,second=Int.MinValue
    for(i <-0 until arr.length  if arr(i)>first) {
      first=arr(i)
    }
    for {
      i <- 0 until arr.length if arr(i) > second; if arr(i) != first
    } {
      second=arr(i)
    }
    second

  def main(args: Array[String]): Unit = {
    println(secondLargest(Array(45,34,76,3,98,12,67,89)))
  }

}
