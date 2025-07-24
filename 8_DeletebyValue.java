package LinkedList.singlyLinkedlist;

class DeletebyValue {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data ) {
            this.data = data;
            this.next = null;
        }
    }
    public void deletvalue(int target){
        Node current = head;
        Node prev = null;

        if(current==null){
            System.out.println("list is empty ");
            return;
        }
        if (head.data==target){
            head=head.next;
            return;
        }

        while (current!=null&&current.data!=target){
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
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
        DeletebyValue list = new DeletebyValue();
        Node n1 = new Node(5);
        Node n2 = new Node(10);
        Node n3 = new Node(15);
        Node n4 = new Node(20);
        Node n5 = new Node(25);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        list.head=n1;
        list.display();

        list.deletvalue(15);
        list.display();
    }
}
/*
Let’s dry run it with this list:

[5] → [10] → [15] → [20]
Let's say target = 15

Iteration 1:
current = 5
5 ≠ 15 → loop continues
prev = 5, current = 10

Iteration 2:
current = 10
10 ≠ 15 → loop continues
prev = 10, current = 15

Iteration 3:
current = 15
✅ 15 == target → current.data != target becomes false
❌ loop ends

✅ What happens after the loop ends?
Now current is pointing to the target node, and prev is pointing to the node just before it.

So we can safely do:

prev.next = current.next;
which removes the target from the list.
 */