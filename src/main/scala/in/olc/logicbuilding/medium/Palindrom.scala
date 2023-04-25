package in.olc.logicbuilding
package in.olc.logicbuilding.medium

import java.util.Scanner

object Palindrom {

  def isPalindrom(num:Int):Boolean={
    //if(num<10 && num>=0) then true
    def reverse(num:Int,acc:Int):Int={
      if(num<10) then (acc*10)+num
      else reverse(num/10,(acc*10)+num%10)
    }
    if(num<10&&num>0) then true
    else Math.abs(num)==reverse(Math.abs(num),0)
    }


  def main(args: Array[String]): Unit = {
    val sc=Scanner(System.in)
    var flag=true
    while(flag==true) {
      println("Enter the number: ")
      val num=sc.nextInt()
      println(isPalindrom(num))
      println("Continue(Yes/No)?: ")
      val prompt=sc.next()
      if(prompt.equalsIgnoreCase("no")) then flag=false
    }
  }
}
