package Stack;
//💡 Why use Linked List for Stack?
//It’s dynamic (no fixed size like arrays)
//
//Insertions and deletions from the head are O(1)
class StackLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    Node top;
    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation: remove from head
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // Peek: return top element
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // isEmpty: check if stack is empty
    boolean isEmpty() {
        return top == null;
    }
   public static void main(String[] args) {
    StackLL stack = new StackLL();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println(stack.pop());   // 30
    System.out.println(stack.peek());  // 20
   }
}
