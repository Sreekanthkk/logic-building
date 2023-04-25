package in.olc.logicbuilding
package in.olc.logicbuilding.strings
//WAP to get a string a user and return a string with every third letter of every word in capital letter
object StringCaps {
  def covert3rdLtrToCaps(str:String):String={

    /*val str2=str.split(" ").map(x=>
      if(x.length>=3) then
        val arr=x.toCharArray
        val temp=arr(2).toUpper
        arr(2)=temp
        arr
      else x
    )*/
    val str2=str.split(" ").map(x=>{
      if(x.length>=3)
        x.grouped(1).map(y=>{
          if y.length==3 then
            val temp=y.charAt(2).toUpper
            val aTemp=s"${y.substring(0,2)}${temp}"
          else y
        }).mkString("")
      else
        x
    }).mkString(" ")
    //println(str2)
    str2.toList.toString()
  }

  def main(args: Array[String]): Unit = {
      println(covert3rdLtrToCaps("This is an example of string operations"))
    //println("This is an example of string operations".grouped()
  }

}
