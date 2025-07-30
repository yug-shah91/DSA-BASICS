package Stack;

class StackArray {
    int[] stack;
    int top;
    int capacity;

    public StackArray(int size) {
        capacity = size ;
        stack = new int[size];
        top = -1 ;
    }
    void push(int x){
        if (top==capacity-1){
            System.out.println("stack overflow");
            return;
        }
        stack[++top]=x;
    }
    int pop(){
        if (top == -1){
            System.out.println("stack underflow");
            return -1;
        }
        return stack[top--];
    }
    int peek() {
        if (top == -1) {
            System.out.println("stack underflow");
            return -1;
        }
        return stack[top];
    }
    boolean is_empty(){
        return top==-1;
    }
    int size (){
        return top +1 ;
    }
     static class Main {
        public static void main(String[] args) {
            StackArray s = new StackArray(5);
            s.push(10);
            s.push(20);
            s.push(30);
            System.out.println("Top element: " + s.peek());  // 30
            System.out.println("Popped: " + s.pop());        // 30
            System.out.println("Top element: " + s.peek());  // 20
        }
    }

}
