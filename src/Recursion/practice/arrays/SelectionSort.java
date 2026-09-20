package Recursion.practice.arrays;

import java.util.Arrays;

//Perform selection sort on an array using recursion.
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,4,1,3,6};
        selSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
    //recursive method
    public static void selSort2(int[] arr){
        helper(arr,0,0,1);

    }
    public static void helper(int[] arr, int pass, int minIndex, int i){
        //base condition
        if(pass == arr.length-1){
            return;
        }

        if(i==arr.length){
            int temp = arr[pass];
            arr[pass] = arr[minIndex];
            arr[minIndex] = temp;
            helper(arr,pass+1,pass+1,pass+2);
        }

        else if(arr[i] < arr[minIndex]){
            helper(arr, pass, i, i+1);
        }
        else{
            helper(arr,pass,minIndex,i+1);
        }

    }

    //iterative method
    public static void selSort1(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] <arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }



}
