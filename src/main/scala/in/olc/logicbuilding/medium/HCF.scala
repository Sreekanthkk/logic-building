package in.olc.logicbuilding
package in.olc.logicbuilding.medium

import java.util.Scanner

object HCF {

  def hcf(num1:Int,num2:Int):Int= {
    def iterator(num1:Int,num2:Int):Int={
      if num2==0 then num1
      //else if num1/num2 ==0 then num2
      else iterator(num2,num1%num2)
    }
    if num1 > num2 then iterator(num1,num2)
    else iterator(num2,num1)
  }
  def main(args: Array[String]): Unit = {
    var flag=true
    while(flag)
      val sc=Scanner(System.in)
      println("Please enter two numbers:")
      val number1=sc.nextInt()
      val number2=sc.nextInt()
      println(hcf(number1,number2))
      println("Continue: y/n")
      if sc.next().equalsIgnoreCase("n") then flag=false
  }


}
