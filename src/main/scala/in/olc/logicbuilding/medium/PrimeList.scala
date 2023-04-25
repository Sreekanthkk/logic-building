package in.olc.logicbuilding
package in.olc.logicbuilding.medium

import java.util.Scanner

object PrimeList extends App {

  def isPrime(num:Int):Boolean={
    def iteratorFunc(itr:Int):Boolean={
      if num<=1 then false
      else if itr> num/2 then true
      else if num%itr==0 then false
      else iteratorFunc(itr+1)
    }
    iteratorFunc(2)
  }

  def primeList(upperLimit:Int):List[Int]={
    (1 to upperLimit).toList.filter(isPrime(_))
  }

  val sc=Scanner(System.in)
  println("Enter the upper limit:")
  val limit=sc.nextInt()
  println(primeList(limit))


}
