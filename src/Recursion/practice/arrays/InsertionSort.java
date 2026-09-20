package Recursion.practice.arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5,6};
        inSort1(arr);
        System.out.println(Arrays.toString(arr));

    }

    //recursive method
    public static void inSort2(int[] arr){

    }



    //iterative method
    public static void inSort1(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int key = arr[i+1];
            int j;
            for(j=i; j>=0; j--){
                if(key < arr[j]){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = key;
        }

    }
}
