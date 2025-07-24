package LinkedList.singlyLinkedlist;


 class LengthLinkedList {
    Node head;
    static class Node{
         int data;
         Node next ;

         public Node(int data){
             this.data=data;
             this.next=null;
         }
    }
    public void length(){
        int count = 0;
        Node current = head;
        while (current!=null){
            count++;
            current=current.next;
        }
        System.out.println("the length of linked list is : " + count);

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
        LengthLinkedList list = new LengthLinkedList();
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(7);

        n1.next=n2;
        n2.next=n3;

        list.head=n1;
        list.display();
        list.length();
    }
}
