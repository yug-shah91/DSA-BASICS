package Stack;

import java.util.Stack;

class ValidParenthesis {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                if (stack.isEmpty())return false;

                char top = stack.pop();//Pop the top opening bracket from the stack
                if (ch==')' && top!='(' || ch=='}' && top!='{'&&ch==']'&&top!='[')return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println("is valid " + isValid(s));
    }
}
//Why stack?

//Stack works on LIFO → Last In, First Out
//When we open something like '(', we want to close it last, like ')'
//So we use a stack to store opening brackets, and whenever a closing bracket comes, we:
//Check if it matches the top of the stack

//If yes, we pop the top
//If no or empty → invalid