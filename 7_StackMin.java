package Stack;

import java.util.Stack;

class StackMin {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack  = new Stack<>();

    public void push(int x){
        mainStack.push(x);
        if (minStack.isEmpty() || x<=minStack.peek()){
            minStack.push(x);// update min if smaller
        }
    }
    void pop(){
        int val = mainStack.pop();
        if (val==minStack.peek()){
            minStack.pop();
        }
    }
    public int  top(){
        return mainStack.peek();
    }
    public int getmin(){
        return minStack.peek();
    }

    public static void main(String[] args) {

    }
}
