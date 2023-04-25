package in.olc.logicbuilding
package in.olc.logicbuilding.medium

import java.util.Scanner

object PrimeNumbers {
  def isPrime(num:Int):Boolean={
    def iteratorFunc(itr:Int):Boolean={
      if num<=1 then false
      else if itr> num/2 then true
      else if num%itr==0 then false
      else iteratorFunc(itr+1)
    }
    iteratorFunc(2)
  }

  def main(args: Array[String]): Unit = {
      val sc=Scanner(System.in)
      var flag=true
      while(flag==true) {
        println("Enter the number: ")
        val num=sc.nextInt()
        println(isPrime(num))
        println("Continue(Yes/No)?: ")
        val prompt=sc.next()
        if(prompt.equalsIgnoreCase("no")) then flag=false
    }

  }

}
