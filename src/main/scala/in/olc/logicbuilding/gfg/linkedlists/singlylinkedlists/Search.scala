package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.linkedlists.singlylinkedlists

object Search {
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
  def search(x:Int)={
    def helper(h:Node):Boolean={
     h match{
       case h if h==null => false
       case h if h.data==x => true
       case _ => helper(h.next)
     }
    }
    helper(head)
  }
  def main(args: Array[String]): Unit = {
    Search.append(2)
    Search.append(3)
    Search.append(4)
    Search.append(5)
    Search.append(6)
    Search.push(7)
    Search.push(8)
    Search.push(9)
    Search.insert(Search.head.next.next,10)

    println(Search.printLL(head))

    println(Search.search(3))
    println(Search.search(23))
  }
}
