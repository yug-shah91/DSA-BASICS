package LinkedList.singlyLinkedlist;

class MidofLinkedList {
  Node head;
  static class Node {
   int data;
   Node next;

   public Node(int data) {
    this.data = data;
    this.next = null;
   }
  }
  public void middle(){
   if(head==null){
    System.out.println("list is empty");
    return;
   }
   Node slow = head;
   Node fast = head;

  // while (fast!=null&&fast.next!=null){  // isse 2nd middle value milegi even num me
    while (fast.next!=null && fast.next.next != null){ // isse 1nd middle value milegi
    slow=slow.next;
    fast=fast.next.next;
   }
   System.out.println("Mid value is : " + slow.data);
  }
  public void display(){
   Node current = head;
   while (current!=null) {
    System.out.print(current.data+"->");
    current=current.next;
   }
   System.out.println("null");
  }

  public static void main(String[] args) {
   MidofLinkedList list = new MidofLinkedList();
   Node n1 = new Node(5);
   Node n2 = new Node(6);
   Node n3 = new Node(7);
   Node n4 = new Node(8);

   n1.next=n2;
   n2.next=n3;
   n3.next=n4;

   list.head=n1;

   list.display();
   list.middle();

  }
}
