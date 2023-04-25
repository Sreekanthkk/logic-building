package in.olc.logicbuilding
package in.olc.logicbuilding.medium

import java.util.Scanner

object MagicNum extends App {
  def sumOfDigits(n:Int):Int={
    def iterator(n:Int,acc:Int):Int={
      if n==0 then acc
      else
        val nextDigit=n%10
        iterator(n/10,acc+nextDigit)
    }
    iterator(n,0)
  }

  def isMagicNumber(n:Int):Boolean={
    def iterator(n:Int):Boolean={
      val sum=sumOfDigits(n)
      sum match {
        case sumOfDigits if (sum == 1) => true
        case sumOfDigits if sum < 10 => false
        case _ => iterator(sum)
      }
    }
    iterator(n)
  }

  var flag=true
  while( flag)
    val sc=Scanner(System.in)
    println("Please enter the numer:")
    val number=sc.nextInt()
    println(isMagicNumber(number))
    println("Continue: y/n")
    if sc.next().equalsIgnoreCase("n") then flag=false

}
