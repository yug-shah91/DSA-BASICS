package arrays;

import java.util.Scanner;

class CheckifSorted {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter the size of array : ");
      int size = input.nextInt();
      int[] arr = new int[size];
      System.out.println("enter elements of array : ");
           for (int i = 0; i < arr.length; i++) {
               arr[i] = input.nextInt();
           }
           boolean inc = sorted(arr);
           boolean dec = issorted(arr);
          if(sorted(arr)){
           System.out.println("the given array is sorted in ascending order " + inc);
          } else if (issorted(arr)) {
           System.out.println("the given array is sorted in descending order " + dec);
          }else {
           System.out.println("array is not sorted ");
          }
    }
            public static boolean sorted(int[] arr){
             for (int i = 0 ; i < arr.length - 1; i++) {
                   if(arr[i] < arr[i + 1]){
                     return true;
                      }
                   }
                return false;
             }
            public static boolean issorted(int[] arr){
             for (int i = 0 ; i < arr.length - 1; i++) {
                 if (arr[i] > arr[i + 1]) {
                     return true;
                 }
             }
             return false;
    }
}
