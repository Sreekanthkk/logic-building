package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.linkedlists.circularlinkedlists

object Insertion {
  var head:Node=null;
  class Node(val data:Int,var next:Node=null)

  def getLastNode(h:Node): Node ={
    h match{
      case h if h.next==head => h
      case _ => getLastNode(h.next)
    }
  }
  def getNode(node:Node,key:Int):(Node,Node) ={
    def helper(prev:Node=head,node:Node):(Node,Node)={
      node match{
        case node if node.next==head => (null,null)
        case node if node.data==key => (prev,node)
        case _ => helper(node,node.next)
      }
    }
    if node.next==head then
      if head.data==key then
        (null,head)
      else
        (null,null)
    else
      helper(node=node)
  }
  def insertAtBeginning(newData:Int): Unit ={
    val newNode=Node(newData)
    if head==null then
      head=newNode
      newNode.next=head
    else
      newNode.next=head
      val lastNode=getLastNode(head)
      lastNode.next=newNode
      head=newNode
  }
  def insertAtEnd(newData:Int): Unit ={
    val newNode=Node(newData)
    if head==null then
      head=newNode
      newNode.next=head
    else
      val lastNode=getLastNode(head)
      newNode.next=head
      lastNode.next=newNode
  }
  def insertAfter(previousNode:Node,newData:Int)={
    if previousNode==null then
      println(s"Previous node cannot be null!!")
    else
      val newNode=Node(newData,previousNode.next)
      previousNode.next=newNode
  }
//need to put more validations
  def delete(data:Int):Unit={
    val (prev,delete)=getNode(head,data)
    if delete!=null then
      println(s"${delete.data} has been removed successfully")
    else
      println(s"could not locate the node with key:${data}")
    if prev!=null then
      prev.next=delete.next
    else
      head=delete

    printLL(head)
  }

  def printLL(node:Node)={
    def helper(h:Node,str:String):String={
      h match{
        case h if h==head => s"${str}]"
        case h => helper(h.next,s"${str},${h.data}")
      }
    }
    if node==null then
      "[]"
    else if node.next == head then
      println(s"[${node.data}]")
    else
      helper(node.next,s"[${node.data}")
  }

  def main(args: Array[String]): Unit = {
    head=Node(1)
    head.next=head
    Insertion.insertAtEnd(2)
    Insertion.insertAfter(head.next,3)
    Insertion.insertAtBeginning(10)
    println(Insertion.printLL(head))
    Insertion.delete(2)
    println(Insertion.printLL(head))

  }
}
