package arrays;

import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        sort(arr);
        display(arr);
    }
    public static void display(int[] arr){
        for (int i = 0 ; i<arr.length ; i++ ){
            System.out.print(arr[i]+" ");
        }

    }
    public static void sort(int[] arr ){
        for (int i = 0 ; i<arr.length-1;i++){  // outer loop - for number of pass
            for (int j = 0; j<arr.length-1-i;j++){  // inner loop - for actual comparison
                if (arr[j]>arr[j+1]){
                    int swap = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
    }
}
//We compare arr[j] and arr[j + 1] → so if j reaches the end, then j + 1 goes out of bounds ❌
//
//That’s why we must stop j at:
//j < n - i - 1
//✅ n - i - 1: To avoid out of bounds and skip sorted part
//
//✅ i: Tracks how many passes have happened
//
//✅ j: Compares each pair
//🔍 Why Only n - 1 Passes Are Required?
//Because:
//
//After placing n - 1 largest elements in their correct positions,
//
//The last remaining element is automatically sorted (because it’s the smallest)
//
//⚠️ If we did a full n passes:
//The last pass would do nothing (0 comparisons)
//
//It’s a waste → we stop at n - 1 passes
// n is num of element