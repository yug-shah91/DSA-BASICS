package LinkedList.singlyLinkedlist;

class LinearSearch {
     Node head;
     static class Node{
         int data;
         Node next;

         public Node(int data){
             this.data=data;
             this.next=null;
         }
     }
     public int search(int target){
         Node current = head;
         int index = 0 ;
         while (current!=null){
             if (target==current.data){
                 return index;
             }
             current=current.next;
             index++;
         }
         return -1;
     }
     public void display(){
         Node curreent = head;
         while (curreent!=null){
             System.out.print(curreent.data+"->");
             curreent=curreent.next;
         }
         System.out.println("null");
     }

    public static void main(String[] args) {
        LinearSearch list = new LinearSearch();
        Node n1 = new Node(5);
        Node n2 = new Node(10);
        Node n3 = new Node(15);
        Node n4 = new Node(20);
        Node n5 = new Node(30);
        Node n6 = new Node(40);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

        list.head=n1;
        list.display();

        int search = list.search(20);
        if (search!=-1){
            System.out.println("number found at index : " + search);
        }
        else {
            System.out.println("element not found");
        }
    }
}
