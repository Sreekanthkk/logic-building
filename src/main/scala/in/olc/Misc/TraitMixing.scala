package in.olc.logicbuilding
package in.olc.Misc


trait A{
  def a=println("A.a")
}

trait B extends A{
  override def a=
    println("B.a")
    super.a
}

trait C extends A{
  override def a=
    println("C.a")
    super.a
}

trait E extends A{
  override def a: Unit =
    println("E.a")
    super.a
}

class D //extends A

class F{
  def a=println("F.a")
}


object TraitMixing {
  def main(args: Array[String]): Unit = {
    //val v1=new D extends F

    //v1.a

    val v2=new D with E with B with C
    //v2.a
  }
}
