package LinkedList.singlyLinkedlist;

 class ReverseLinkedList {
  Node head;
  static class Node {
   int data;
   Node next;

   public Node(int data) {
    this.data = data;
    this.next = null;
   }
  }
   public void reverse(){
    Node prev = null;
    Node cureent = head;
    Node next;
     while (cureent!=null){
      next=cureent.next;
      cureent.next=prev;
      prev = cureent;
      cureent=next;
     }
  head=prev;
   }

   public void display(){
    Node current = head;
    while (current!=null){
     System.out.print(current.data+"->");
     current=current.next;
    }
    System.out.println("null");
   }

  public static void main(String[] args) {
   ReverseLinkedList list = new ReverseLinkedList();
   Node n1 = new Node(5);
   Node n2 = new Node(15);
   Node n3 = new Node(25);
   Node n4 = new Node(35);
   n1.next=n2;
   n2.next=n3;
   n3.next=n4;

   list.head=n1;
   list.display();
   list.reverse();
   list.display();

  }
  }

/*
🧩 Before Reversal
We have this linked list:

head → [10] → [20] → [30] → null
Each node points to the next one.

We're standing at:

current = 10
prev = null
next = 20

We will walk through each node and flip its arrow backwards.

🔁 Step-by-Step Reversal Process:
Step 1:
current = 10
next = 20
Reverse: 10.next = null (previous)
Now move:
prev = 10
current = 20

Step 2:
current = 20
next = 30
Reverse: 20.next = 10
Move:
prev = 20
current = 30

Step 3:
current = 30
next = null
Reverse: 30.next = 20
Move:
prev = 30
current = null ✅ Done

🧩 After Reversal
Now, we set head = prev
Which means:


head → [30] → [20] → [10] → null
We have successfully reversed the list by changing the .next arrows.

🧠 Key Rule:
Each step does this:

next = current.next;
current.next = prev;
prev = current;
current = next;
You don’t lose any nodes, and you reverse the links!


 */
