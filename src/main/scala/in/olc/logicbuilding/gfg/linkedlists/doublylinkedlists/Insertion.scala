package in.olc.logicbuilding
package in.olc.logicbuilding.gfg.linkedlists.doublylinkedlists

object Insertion {
  var head:Node=null
  var last:Node=null
  class Node(var data:Int,var prev:Node=null,var next:Node=null)
  /*
  Adds the data in the front
  **/
  def push(newData:Int)={
    if head==null then
      head=new Node(newData)
    else
      val newNode=new Node(newData,next=head)
      head.prev=newNode
      head=newNode
  }

  /*
  Adds the data at the end
  **/
  def append(newData:Int)={
    if head==null then
      head=new Node(newData)
    else
      helper(head)
    def helper(h:Node):Unit={
      h match{
        case h if h.next==null =>{
          val newNode=Node(newData,h,null)
          h.next=newNode
        }
        case _ => helper(h.next)
      }
    }
  }

  def insertAfter(previousNode:Node,newData:Int)={
    if previousNode==null then
      println(s"Previous node cannot be null!!")
    else
      val newNode=Node(newData,previousNode,previousNode.next)
      previousNode.next=newNode
      if newNode.next!=null then
        newNode.next.prev=newNode
  }

  def insertBefore(nextNode:Node,newData:Int)={
    if nextNode==null then
      println(s"next node cannot be null!!")
    else
      val newNode=Node(newData,nextNode.prev,nextNode)
      nextNode.prev=newNode
      if newNode.prev!=null then
        newNode.prev.next=newNode
  }
  def printLL(head:Node,forward:Boolean)={
    def helper(h:Node,str:String):String={
      h match{
        case h if h==null => s"${str}]"
        case h if forward => {
          last=h
          helper(h.next,s"${str},${h.data}")
        }
        case h if !forward => {
          helper(h.prev,s"${str},${h.data}")
        }
      }
    }
    if head==null then
      "[]"
    else if forward then
      helper(head.next,s"[${head.data}")
    else
      helper(last.prev,s"[${last.data}")

  }

  def main(args: Array[String]): Unit = {
    Insertion.append(2)
    Insertion.append(3)
    Insertion.append(4)
    Insertion.append(5)
    Insertion.append(6)
    Insertion.push(7)
    Insertion.push(8)
    Insertion.push(9)
    Insertion.insertBefore(head.next.next,20)
    Insertion.insertAfter(head.next.next.next,40)
    Insertion.insertAfter(Insertion.head.next.next,10)

    println(Insertion.printLL(head, true))
    println(Insertion.printLL(head, false))
  }

}
