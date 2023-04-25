package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.linkedlists.singlylinkedlists

object Count {
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
  def count(head:Node)={
    def helper(h:Node,count:Int):Int={
      h match{
        case h if h==null => count
        case _ => helper(h.next,count+1)
      }
    }
    helper(head,0)
  }
  def main(args: Array[String]): Unit = {
    Count.append(2)
    Count.append(3)
    Count.append(4)
    Count.append(5)
    Count.append(6)
    Count.push(7)
    Count.push(8)
    Count.push(9)
    Count.insert(Count.head.next.next,10)

    println(Count.printLL(head))
    println(Count.count(head))
  }
}
