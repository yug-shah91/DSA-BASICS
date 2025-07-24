package LinkedList.singlyLinkedlist;

class SinglyDeletion {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void deletehead(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    public void Deleteatend(){
        // zero element
        if(head==null){
            System.out.println("List is empty ");
            return;
        }
        // only one element
        if (head.next==null){
            head=null;
            return;
        }
        Node current = head;
        while (current.next.next!=null){
            current=current.next;
        }
        current.next=null;
    }
    public void deleteatIndex(int index) {
        // zero element
        if (head == null) {
            System.out.println("List is empty ");
            return;
        }
        // only one element
        if (index == 0) {
            head = null;
            return;
        }
        Node current = head;
        int count = 0;

        while (current!=null&&count<index-1){
            current=current.next;
            count++;
        }
        if (current == null || current.next == null) {
            System.out.println("Index out of bounds!");
            return;
        }
        current.next=current.next.next;
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
        SinglyDeletion list = new SinglyDeletion();
        Node n1= new Node(5);
        Node n2 = new Node(10);
        Node n3 =new Node(15);
        Node n4 =new Node(20);
        Node n5 =new Node(25);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

       list.head=n1;
       list.display();
       list.deletehead();
       list.display();
       list.Deleteatend();
       list.display();
       list.deleteatIndex(2);
       list.display();
    }
}
// What is current != null?
//It means:
//
//"As long as you're still standing on a node, keep going."
//
//Because if current == null, you're already past the end of the list!