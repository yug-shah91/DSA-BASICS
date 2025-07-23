package arrays;

import java.util.Scanner;

 class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the size of array  : "  );
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of array : ");
        for (int i  = 0 ; i<arr.length ; i++){
            arr[i]=input.nextInt();
        }
        System.out.println("enter the target element ");
        int target = input.nextInt();
        int index = target(arr,target);
        if(target != -1){
            System.out.println("element found at index : " + index);
        }else {
            System.out.println("element not found ");
        }
    }
    public static int target(int[] arr , int target ){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;// Find the middle index
             if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {            // If target is greater, ignore left half
                start= mid+1;// Move start to the right
            }
            else {  // If target is smaller, ignore right half
                end= mid-1;// Move end to the left
            }
        }
        // If element not found
        return -1;
    }
}
//int mid = (start + end) / 2;
//int value = arr[mid]; // 💥 Now we're using `mid` (which used start) as an index!
// Here, we’re telling Java:
//
//“Go to the array, take the value at position mid.”
//
//And since mid was calculated using start, that means start is indirectly acting as an index.