package in.olc.logicbuilding
package in.olc.logicbuilding.others

object Shotform {

  def getShortform(str:String):String={
    //str.split(" ").flatMap(_.headOption).mkString
    val str2=str.split(" ").map(_.substring(0,1)).foldLeft("")((x,y)=> {
      if x=="" then x+y
      else x +"."+y
    }
    )
    //println(str2)
    str2
  }

  def main(args: Array[String]): Unit = {
      println(getShortform("THIS IS A CAT"))
  }

}
