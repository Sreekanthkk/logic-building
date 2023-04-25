package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.arrays

object EvenGTOdd {
  def evenGtOdd(a:Array[Int])={
    for(i <- 1 until a.length){
       i%2 match{
         case 0 =>{
           if a(i)>a(i-1) then
             val temp=a(i)
             a(i)=a(i-1)
             a(i-1)=temp
         }
         case _ =>{
           if a(i)<a(i-1) then
             val temp=a(i)
             a(i)=a(i-1)
             a(i-1)=temp
         }
       }
    }
    a
  }

  def main(args: Array[String]): Unit = {
    println(evenGtOdd(Array( 1, 3, 2, 2, 5)).toList.toString())
  }
}
