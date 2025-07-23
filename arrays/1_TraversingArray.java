package arrays;

import java.util.Scanner;

 class TraversingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array : ");
        for (int i  = 0 ; i < arr.length ; i++ ){
            arr[i]=input.nextInt();
        }

//        int[] arr = {20,30,40,50};

        for (int i = 0; i<arr.length;i++){
            System.out.print("the index  " + i + " has : "+ arr[i] + " \n");
        }

    }
}
