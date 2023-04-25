package in.olc.logicbuilding
package in.olc.logicbuilding.medium

import java.util.Scanner

object SumOfDigits {
  def sumOfDigits(num:Int):Int={
    def sumOfDigits(num:Int,acc:Int):Int={
      if(num<10) then acc+num
      else sumOfDigits(num/10,(acc+num%10))
    }
    if(num<10&&num>0) then num
    else sumOfDigits(Math.abs(num),0)
  }

  def main(args: Array[String]): Unit = {
    val sc=Scanner(System.in)
    var flag=true
    while(flag==true) {
      println("Enter the number: ")
      val num=sc.nextInt()
      println(s"Reversed: ${sumOfDigits(num)}")
      println("Continue(Yes/No)?: ")
      val prompt=sc.next()
      if(prompt.equalsIgnoreCase("no")) then flag=false
    }
  }
}
