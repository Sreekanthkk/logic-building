package in.olc.logicbuilding

class Test {
  def testMethod(num:Int):Unit={
    println("I am from Test Class: "+num)
  }
}

class Child extends Test{
  override def testMethod(num: Int): Unit = println("I am from Child class: "+num)

  def childMethod(str:String):Unit=println("I am from childMethod"+str)
}

def sumOfUnicodes(str:String):Int={
  str.reduce((x,y)=>(x.toInt+y.toInt).toChar)
}

def findGreatestStringByUniCode(a:String,b:String)={
  print(s"${a} > ${b} = ${sumOfUnicodes(a)}>${sumOfUnicodes(b)} =")
  if sumOfUnicodes(a)>sumOfUnicodes(b) then
    println(a)
    a

  else
    println(b)
    b

}

import scala.concurrent.{Future as temp, *}
import java.util.{Date=>javaDate}

val dt=new javaDate()

trait Animal{
  def aType:String
  def eat:String=s"anything"
}

trait Carnivores {
  def eat: String //= s"eats meat"
}

class Fox extends Carnivores with Animal {
  override def aType: String ="Wild"

  //override def eat: String = super.eat
}

object Test{
  def split(num:Int,digitList:List[Int]=Nil):List[Int]= {
    if num==0 then digitList
    else
      split(num/10,num%10::digitList)
  }

  def dynamicInputs(args:Int*)={
    args.foreach(println)
    println(args)
  }
  def main(args: Array[String]): Unit = {
     val obj:Test=new Child

        obj.testMethod(2);
        //obj.childMethod("aaa");

        println("10%5: "+10%5)
        println("10/5: "+7/5)
        println(split(59).toString())

        val aList=List(1,32,5,6)

        dynamicInputs(aList:_*)
        dynamicInputs()
        val s="%07d".format(151)

        val f="%07.2f".format(151.2f)
        println(s)
        println(f)
        println("%.2f".format(151.2f))

        //formatted
        //$$ - to print $
        //s"""
        //""" to escape all evaluations

        val aList2=List("Suraz","Kiran","Suresh")
        val greatest=aList2.reduceLeft(findGreatestStringByUniCode)

        println(greatest)

        val aFox=new Fox
        println(aFox.eat)
    // 2D array
  }
}
