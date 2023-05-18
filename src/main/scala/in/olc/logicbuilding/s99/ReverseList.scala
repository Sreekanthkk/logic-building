package in.olc.logicbuilding
package in.olc.logicbuilding.s99

object ReverseList {
  def doReverse[A](list:List[A]):List[A]={
    list.foldLeft(List[A]())((a,b)=>{
      //println(a.toString())
      //println(b.toString)
      b::a
    })
  }

  def doReverseRec[A](list:List[A]):List[A]={
    def helper(acc:List[A],traverserList:List[A]):List[A]={
      traverserList match{
        case Nil => acc
        case h::tail=>helper(h::acc,tail)
      }
    }
    helper(Nil,list)
  }

  def main(args: Array[String]): Unit = {
    println(doReverse[Int](List(1,2,3,4,5,6)))
    println(doReverseRec[Int](List(1,2,3,4,5,6)))
  }
}
