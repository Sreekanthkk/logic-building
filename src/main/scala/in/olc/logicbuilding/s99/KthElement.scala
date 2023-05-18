package in.olc.logicbuilding
package in.olc.logicbuilding.s99

object KthElement {
  def findKthElement[A](list:List[A],k:Int):A={
    def helper(list:List[A],counter:Int):A={
      list match{
        case Nil=> throw new NoSuchElementException
        case h::tail if counter==k =>h
        case _::tail => helper(tail,counter+1)
      }
    }
    helper(list,0)
  }
//Other approaches
// Trivial with builtins.
def nthBuiltin[A](n: Int, ls: List[A]): A =
  if (n >= 0) ls(n)
  else throw new NoSuchElementException

  // Not that much harder without.
  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _   ) => h
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case (_, Nil      ) => throw new NoSuchElementException
  }


  def main(args: Array[String]): Unit = {
    println(findKthElement[Int](List(1,2,3,4,5,6),4))
    println(findKthElement[Int](List(1,2,3,4,5,6),0))
    println(findKthElement[Int](List(1,2,3,4,5,6),5))
    println(findKthElement[Int](List(),5))
    println(findKthElement[Int](List(1,2,3,4,5,6),8))
  }
}
