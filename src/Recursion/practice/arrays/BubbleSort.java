package Recursion.practice.arrays;

import java.util.Arrays;

//Perform bubble sort on an array using recursion.
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5,6};
        bSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    //LOGIC: The two nested loops in the iterative method are reduced to two method parameters
    //inside the recursive helper function, one for the pass and another for which index we
    //are currently on

    //recursive method
    public static void bSort2(int[] arr){
        helper(arr,arr.length-1, 0);
    }

    public static void helper(int[] arr, int pass, int index){
        //base condition
        if(pass==0){
            return;
        }

        if(index == pass){
            helper(arr,pass-1, 0);
        }
        else if(index<pass){
            if(arr[index] > arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            helper(arr, pass, index+1);
        }
    }

    //iterative method
    public static void bSort1(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
        }
    }
}
