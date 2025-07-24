package LinkedList.singlyLinkedlist;

 class LinkedListDemo {
     /*
     static means:
👉 "This thing belongs to the class, not to any object."

Imagine a college class:
static = college rules (shared by all students)
non-static = each student's name, ID (unique to each)


     But WHY do we want it static?
Because the Node is just a box holding:
data
next
It doesn’t need to know anything about the outer LinkedList.
So why force it to depend on the outer class?
      */
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(10);
            Node c = new Node(15);

            a.next=b;
            b.next=c;

            Node temp = a; // head
            while (temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
}
