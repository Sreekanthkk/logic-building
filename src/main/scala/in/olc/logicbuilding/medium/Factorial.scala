package in.olc.logicbuilding
package in.olc.logicbuilding.medium

import java.util.Scanner

object Factorial {

  def factorial(num:BigInt):BigInt={
    def iterator(num:BigInt,acc:BigInt):BigInt={
      if num==1 then acc
      else iterator(num-1,acc*num)
    }
    iterator(num,1)
  }

  def main(args: Array[String]): Unit = {
    var flag=true
    while(flag)
      val sc=Scanner(System.in)
      println("Please enter the numer:")
      val number=sc.nextBigInteger()
      println(factorial(number))
      println("Continue: y/n")
      if sc.next().equalsIgnoreCase("n") then flag=false
  }

}
