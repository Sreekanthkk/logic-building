package in.olc.logicbuilding
package in.olc.logicbuilding

import java.util.Scanner

object TwoDigitSpclNum extends App{
  def split(num:Int,digitList:List[Int]=Nil):List[Int]= {
    if num==0 then digitList
    else
      split(num/10,num%10::digitList)
  }


  def isSpecialNum(num:Int):Boolean={
    if num<10 || num>99 then false
    else
      val sum= split(num).sum
      val prod=split(num).foldLeft(1)((a,b)=>a*b)
      num==sum+prod
  }

  var flag=true
  while( flag)
    val sc=Scanner(System.in)
    println("Please enter the numer:")
    val number=sc.nextInt()
    println(isSpecialNum(number))
    println("Continue: y/n")
    if sc.next().equalsIgnoreCase("n") then flag=false


}
