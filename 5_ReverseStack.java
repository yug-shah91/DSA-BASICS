package Stack;

import java.util.Stack;

class ReverseStack {
    public static void main(String[] args) {
         String s = "hello";
        Stack<Character> stack = new Stack<>();

        for (int i  =0 ; i<s.length();i++){
            stack.push(s.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        System.out.println("reversed  " + reversed.toString());
    }
}
//push + Pop	O(n)	O(n)