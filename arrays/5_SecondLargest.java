package arrays;

import java.util.Scanner;

class SecondLargest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the size of array : ");
    int size = input.nextInt();
    int[] arr = new int[size];
    System.out.println("enter elements of array : ");
    for (int i  = 0 ; i < arr.length ; i++ ){
      arr[i]=input.nextInt();
    }
    // 1 pass
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("MAx num is : " + max);
    //2 pass
    int SecondMax = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]<max && arr[i]>SecondMax){
        SecondMax=arr[i];
      }
    }
    System.out.println("Second max num is : " + SecondMax);
  }
}

