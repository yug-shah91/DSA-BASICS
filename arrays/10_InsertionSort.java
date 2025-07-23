package arrays;

import java.util.Scanner;

class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the element in the array : ");
        for (int i = 0 ; i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        insertion(arr);
        System.out.println("the sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void insertion(int[] arr){

        for (int i = 1; i <arr.length; i++) {     //[3,2,5,4,8]
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
// why j--  ????
// int[] arr = {5, 3, 1, 4};

//First loop (i = 1):
//key = 3, j = 0
//Compare arr[j] = 5 with key = 3
//5 is bigger, so shift 5 to the right (arr[1] = 5)
//Now move to the next element to the left → that’s j--
//(now j = -1 → loop ends)


//Because we’re moving backward in the array to check:
//Is arr[0] > key?
//Then is arr[-1]? (loop ends)
//If we don’t use j--, the loop will keep checking the same element and get stuck — infinite loop.

// arr[j + 1] = key; is used to put the number you're inserting (key) into its correct place after you've moved all bigger numbers one step right.