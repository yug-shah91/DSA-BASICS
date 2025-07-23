package arrays;

import java.util.Scanner;

 class MaximumMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array : ");
        for (int i  = 0 ; i < arr.length ; i++ ){
            arr[i]=input.nextInt();
        }
        System.out.println("the max element is " + Max(arr));
        System.out.println(" the min element is " + Min(arr));
    }
    public static int Max (int[] arr){
        int Max = arr[0];
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>Max) {
                Max = arr[i];
            }
        }
        return Max;
    }
    public static int Min (int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
