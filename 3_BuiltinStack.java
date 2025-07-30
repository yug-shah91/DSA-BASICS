package Stack;

import java.util.Stack;

class BuiltinStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("stack : " + stack);
        System.out.println("top element : " + stack.peek());
        System.out.println("remove first element "+stack.pop());
        System.out.println("afte pop stack " + stack);
    }
}
