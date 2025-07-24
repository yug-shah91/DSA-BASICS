package LinkedList.singlyLinkedlist;

class Insertion {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // insertion at end
    public void insertatEnd(int value){
        Node newNode = new Node(value);

        if (head==null){
            head=newNode;
            return;
        }
        Node current =head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    //insertion at head
    public void insertatHead(int value){
        Node newNode = new Node(value);
        newNode.next=head;
        head=newNode;
    }
    // insert at index
     public void insertatIndex(int value,int index){
        if (index==0){
            insertatHead(value);
            return;
        }
        Node newNode = new Node(value);
        Node current = head;
        int count = 0;

        while (current!=null&& count <index -1){
            current=current.next;
            count++;
        }
        if (current==null){
            System.out.println("index out of bound");
            return;
        }
        newNode.next=current.next;
        current.next=newNode;
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
        Insertion list = new Insertion();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next=n2;
        n2.next=n3;

        list.head=n1;
        list.display();

        list.insertatEnd(20);
        list.display();
        list.insertatHead(0);
        list.display();
        list.insertatIndex(100,2);
        list.display();
    }
}
//current != null: to make sure you're not going past the list
//
//count < index - 1: because we want to stop at the node before the index

//🔸 if (current == null)
//After the loop, this checks:
//
//❗ Did you go past the end of the list?
//
//That means:
//
//You tried to insert at an index bigger than the list size
//
//Or the list is empty and index is not 0