package in.olc.logicbuilding
package in.olc.logicbuilding.medium

import java.util.Scanner

object ProductOfDigits {

  def productOfDigits(num:Int):Int={
    def productOfDigits(num:Int,acc:Int):Int={
      if(num==0) then 0
      else if(num<10) then acc*num
      else productOfDigits(num/10,acc*(num%10))
    }
    if(num<10&&num>0) then num
    else productOfDigits(Math.abs(num),1)
  }
  def main(args: Array[String]): Unit = {
    val sc=Scanner(System.in)
    var flag=true
    while(flag==true) {
      println("Enter the number: ")
      val num=sc.nextInt()
      println(s"Reversed: ${productOfDigits(num)}")
      println("Continue(Yes/No)?: ")
      val prompt=sc.next()
      if(prompt.equalsIgnoreCase("no")) then flag=false
    }
  }
}
