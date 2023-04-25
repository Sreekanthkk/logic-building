package in.olc.logicbuilding
package in.olc.logicbuilding.medium

import java.util.Scanner

object SumOfNaturalNums {
  def sumOfNNums(num:Int):Int={
    def iterator(num:Int,acc:Int):Int={
      if num==0 then acc
      else iterator(num-1,acc+num)
    }
    iterator(num,0)
  }
  def main(args: Array[String]): Unit = {
    var flag=true
    while(flag)
      val sc=Scanner(System.in)
      println("Please enter the numer:")
      val number=sc.nextInt()
      println(sumOfNNums(number))
      println("Continue: y/n")
      if sc.next().equalsIgnoreCase("n") then flag=false
  }
}
