package in.olc.logicbuilding
package in.olc.logicbuilding.medium

import java.util.Scanner

object UglyNumber {

  def isDivicible(number: Int, divisorList: List[Int]): Boolean = {
    def iterator(num: Int, divisorTempList: List[Int]): Boolean = {
      val divisor=divisorTempList.head
      if num % divisor == 0 && num>divisor then iterator( num/divisor, divisorTempList)
      //else if num/divisor==1 then true
      else if !divisorTempList.tail.isEmpty then iterator(num,divisorTempList.tail)
      else num%divisor==0
    }
    if number==1 then true
    else iterator(number, divisorList.filter(_<=number))
  }
  def isUglyNumber(num:Int):Boolean={
    isDivicible(num,List(2,3,5))
  }
  def main(args: Array[String]): Unit = {
    var flag=true
    while(flag)
      val sc=Scanner(System.in)
      println("Please enter the number:")
      val number=sc.nextInt()
      println(isUglyNumber(number))
      println("Continue: y/n")
      if sc.next().equalsIgnoreCase("n") then flag=false
  }
}
