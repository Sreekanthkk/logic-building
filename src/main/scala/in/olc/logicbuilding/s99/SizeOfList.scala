package in.olc.logicbuilding
package in.olc.logicbuilding.s99

object SizeOfList {
  def findSizeOfList[A](list:List[A]):Int={
    def helper(l:List[A],size:Int):Int={
      l match{
        case Nil=> size
        case _::tail=>helper(tail,size+1)
      }
    }
    helper(list,0)
  }

  def main(args: Array[String]): Unit = {
    println(findSizeOfList[Int](List(1,2,3,4,5,6)))
    println(findSizeOfList[Int](List(1,2,3,4,5,6,5,6,7,8,8)))
    println(findSizeOfList[Int](List()))
  }
}
