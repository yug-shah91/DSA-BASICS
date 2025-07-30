package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

//Why use Deque as a Stack?
//Java has a class called Stack, but it's slow because it's thread-safe (not needed for DSA).
class StackDequeue {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
                stack.push(10);
                stack.push(20);
                stack.push(30);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
//✅ Why ArrayDeque is used instead of Stack
//🔹 1. Stack is Old and Slow
//Stack is based on Vector, which is synchronized (thread-safe) — this makes it slower.

//But for most DSA/interview problems, you don't need synchronization.
//So Stack is unnecessarily slow for our purpose.
//🔹 2. ArrayDeque is faster
//Internally backed by a resizable array

//No synchronization → much faster
//Constant time for push(), pop(), and peek()

//🔹 3. ArrayDeque supports both ends
//Although we use it as a stack (LIFO), it can also work as a queue (FIFO)
//This makes it super flexible for both Stack and Queue DSA problems