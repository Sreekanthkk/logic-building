package in.olc.logicbuilding
package in.olc.logicbuilding.medium

import java.util.Scanner

object HappyNumbers extends App{

  def sumOfSqrt(n:Int):Int={
    def iterator(n:Int,acc:Int):Int={
      if n==0 then acc
      else
        val nextDigit=n%10
        iterator(n/10,acc+(nextDigit*nextDigit))
    }
    iterator(n,0)
  }

  def isHappyNumber(n:Int):Boolean={
    def iterator(n:Int):Boolean={
      val sumOfSqrtOfDigits=sumOfSqrt(n)
      sumOfSqrtOfDigits match {
        case sumOfSqrtOfDigits if sumOfSqrtOfDigits == 1 => true
        case sumOfSqrtOfDigits if sumOfSqrtOfDigits < 10 => false
        case _ => iterator(sumOfSqrtOfDigits)
      }
    }
    iterator(n)
  }

  var flag=true
  while( flag)
    val sc=Scanner(System.in)
    println("Please enter the numer:")
    val number=sc.nextInt()
    println(isHappyNumber(number))
    println("Continue: y/n")
    if sc.next().equalsIgnoreCase("n") then flag=false


}
