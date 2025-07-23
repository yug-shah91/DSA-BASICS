package arrays;

import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        reverse(arr);   // revese to kara diya par display kara na bhool gaya // array ko display bhi kara na padta hai aise he nai hota

        System.out.println("reversed array ");
        displayarray(arr);
    }
    public static void displayarray(int[] array){
        int i = 0;
        while (i<array.length){
            System.out.print(array[i]+" ");
            i++;
        }
        System.out.println();
    }

    public static void reverse(int[] arr){
        int swap ;
//        int i ;
        for ( int i = 0; i < arr.length/2; i++) {
                swap=arr[i];
                arr[i]=arr[(arr.length-1)-i];
                arr[arr.length-i-1]=swap;
        }
    }
}
