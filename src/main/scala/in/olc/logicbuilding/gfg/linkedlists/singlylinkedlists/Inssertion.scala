package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.linkedlists.singlylinkedlists

object Inssertion {
  var head:Node=null
  class Node(var data:Int,var next:Node=null)
  def push(newData:Int)={
    if head==null then
      head=new Node(newData)
    else
      val newNode=new Node(newData,head)
      head=newNode
  }
  def append(newData:Int)={
    if head==null then
      head=new Node(newData)
    else
      helper(head)
    def helper(h:Node):Unit={
      h match{
        case h if h.next==null =>{
          val newNode=new Node(newData,null)
          h.next=newNode
        }
        case _ => helper(h.next)
      }
    }
  }

  def insert(previousNode:Node,newData:Int)={
    if previousNode==null then
      println(s"Previous node cannot be null!!")
    else
      val newNode=Node(newData,previousNode.next)
      previousNode.next=newNode
  }

  def printLL(head:Node)={
    def helper(h:Node,str:String):String={
      h match{
        case h if h==null => s"${str}]"
        case h => helper(h.next,s"${str},${h.data}")
      }
    }
    if head==null then
      "[]"
    else
      helper(head.next,s"[${head.data}")
  }
  def main(args: Array[String]): Unit = {
    Inssertion.append(2)
    Inssertion.append(3)
    Inssertion.append(4)
    Inssertion.append(5)
    Inssertion.append(6)
    Inssertion.push(7)
    Inssertion.push(8)
    Inssertion.push(9)
    Inssertion.insert(Inssertion.head.next.next,10)

    println(Inssertion.printLL(head))

  }

}
