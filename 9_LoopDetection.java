package LinkedList.singlyLinkedlist;
/*
 Method: Floyd’s Cycle Detection (Tortoise & Hare)
🐢 Slow and 🐇 Fast pointers:
slow moves 1 step
fast moves 2 steps
If there is a loop → slow == fast at some point
If no loop → fast will reach null
 */
class LoopDetection {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public boolean detect(){
        Node slow = head;
        Node fast = head;

        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast){
                return true;//loop exist
            }
        }
        return false;
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
        LoopDetection list = new LoopDetection();
        Node n1 = new Node(5);
        Node n2 = new Node(10);
        Node n3 = new Node(15);
        Node n4 = new Node(20);

        n1.next=n2;
        n2.next=n3;
        n3.next=n2;

        list.head=n1;
        System.out.println("list has loop : " + list.detect());
        //list.display();
    }
}
