package arrays;

import java.util.Scanner;

class SelectionSort {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("enter the size of array : ");
  int size = input.nextInt();
  int[] arr = new int[size];
  System.out.println("enter elements of array : ");
  for (int i = 0; i < arr.length; i++) {
   arr[i] = input.nextInt();
  }
  selectionsort(arr);
  display(arr);

  }
  public static void display(int[] arr){
     for (int i = 0; i<arr.length;i++){
      System.out.print(arr[i]+" ");
     }
  }
  public static void selectionsort(int[] arr){
   for (int i = 0 ; i< arr.length-1 ;i++){
     int minIndex = i ;
     for (int j= i+1 ; j<arr.length;j++){
      if (arr[j]<arr[minIndex]){
       minIndex=arr[j];
      }
     }
     int swap = arr[i];
     arr[i]=arr[minIndex];
     arr[minIndex]=swap;
   }
 }
}
//🟩 This inner loop checks the rest of the array (after i) to find the actual minimum.
//
//We start from i + 1 because we’re comparing with the rest of the unsorted part.

//You go from left to right.
//At each i, you say: “Let’s fix this position with the smallest element from the rest.”
//🔄 Inner Loop (j)

//    for (int j = i + 1; j < arr.length; j++) {
//You search the remaining part of the array (from i + 1 to end) to find the smallest value.
//
//j is like your scanning finger 👆