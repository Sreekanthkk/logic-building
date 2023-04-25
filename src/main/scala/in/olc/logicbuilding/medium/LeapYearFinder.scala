package in.olc.logicbuilding
package in.olc.logicbuilding.medium

object LeapYearFinder {
def isLeapYear(year:Int):Boolean={
  if((year%4==0) ||(year%100==0 && year%400==0) )
     true
  else false
}
def leapYearList(yob:Int,ob:Int):List[Int]={
  val range=(yob to ob).toList.filter(isLeapYear(_))
  //println((yob to ob).toList.toString())
  range
}

  def main(args: Array[String]): Unit = {
      println(leapYearList(1984,2023).toString())
      println(leapYearList(1984,2023).size)
  }
}
