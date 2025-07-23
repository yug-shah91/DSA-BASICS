package arrays;

import java.util.Scanner;

class LinearSearch {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("enter the size of array : ");
  int size = input.nextInt();
  int[] arr = new int[size];
  System.out.println("enter elements of array : ");
  for (int i = 0; i < arr.length; i++) {
   arr[i] = input.nextInt();
  }
  System.out.println("enter the number you want to search : ");
  int num = input.nextInt();
  boolean isfound = isfound(arr,num);
  if(isfound){
   System.out.println("the num is present ");
  }else {
   System.out.println("does not exist");
  }
 }

 public static boolean isfound(int[] arr, int num) {
  for (int i = 0; i < arr.length; i++) {
   if (arr[i] == num) {
    System.out.println("the num exist  " + num);
    return true;
   }
  }
  return false;
 }
}
