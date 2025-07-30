package Stack;

import java.util.Stack;

/*
For every element in the array, find the next greater element to its right.
If there is none, return -1 for that position.

🔹 Example:
Input:
arr = [4, 5, 2, 25]
Output:
[5, 25, 25, -1]
 */
public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {4,5,2,25};//Input array. We want to find the next greater element for each number.
        int[] result = nextgreaterelement(arr);//Calling the function nextGreaterElements which does the actual logic.

        for (int val : result ){
            System.out.print(val + " ");//We are printing the final result.
                                       // Output should be: 5 25 25 -1
        }
    }
    public static int[] nextgreaterelement(int[] arr){
        int n = arr.length;//Get the size of the array arr.
        int[] result = new int[n];//Create an array result[] of size n to store answers.
        Stack<Integer> stack= new Stack<>();//This stack will help us find the next greater element.

        //We’ll store elements from right to left.



        // travere right to left

        for (int i = n-1 ;i>=0;i-- ){
            while (!stack.isEmpty()&&stack.peek()<=arr[i]){//We remove any elements from the top of the stack that are smaller than or equal to arr[i].
               // Why? Because they can't be the next greater for current element or any previous elements.
                stack.pop();//We remove useless smaller elements that can't be the next greater for any upcoming number.
            }
            if (stack.isEmpty()){
                result[i]=-1;
            }else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
}
