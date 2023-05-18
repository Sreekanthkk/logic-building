package in.olc.logicbuilding
package in.olc.logicbuilding.s99

import scala.annotation.tailrec

object LastElementOfList {
  @tailrec
  def findLastElment[A](list:List[A]):A= {
        list match {
          case Nil => throw new NoSuchElementException("Empty List")
          case h :: Nil => h
          case h :: tail => findLastElment(tail)
          case _ => throw new NoSuchElementException
        }
  }

  /*def findLastElment[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => findLastElment(tail)
    case _         => throw new NoSuchElementException
  }*/
  //Other approaches
  // Again, with builtins this is easy.
  def penultimateBuiltin[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last

  // But pattern matching also makes it easy.
  def penultimateRecursive[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil => h
    case _ :: tail     => penultimateRecursive(tail)
    case _             => throw new NoSuchElementException
  }


  // Just for fun, let's look at making a generic lastNth function.

  // An obvious modification of the builtin solution works.
  def lastNthBuiltin[A](n: Int, ls: List[A]): A = {
    if (n <= 0) throw new IllegalArgumentException
    if (ls.length < n) throw new NoSuchElementException
    ls.takeRight(n).head
  }

  // Here's one approach to a non-builtin solution.
  def lastNthRecursive[A](n: Int, ls: List[A]): A = {
    def lastNthR(count: Int, resultList: List[A], curList: List[A]): A =
      curList match {
        case Nil if count > 0 => throw new NoSuchElementException
        case Nil              => resultList.head
        case _ :: tail        =>
          lastNthR(count - 1,
            if (count > 0) resultList else resultList.tail,
            tail)
      }
    if (n <= 0) throw new IllegalArgumentException
    else lastNthR(n, ls, ls)
  }

  def main(args: Array[String]): Unit = {
    println(findLastElment[Int](List(1,2,3,4,5,6)))
    println(findLastElment[Int](List(1)))
    println(findLastElment[Char](List('a','b','c','d')))
    println(findLastElment[Int](List(-1,-2,-3,-4)))
    println(findLastElment[Int](List()))
  }

}
