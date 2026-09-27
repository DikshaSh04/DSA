package Recursion.practice;

import java.util.Arrays;
//This implementation is done using HOARE PARTITIONING scheme where
//the partition(sorting around the pivot) is done using two pointers on both ends.

//The  other partition scheme is Lomuto partitioning where a pointer keeps track of smaller
//elements and arranges them to the LHS of the pivot.

//HOARE partitioning takes fewer swaps and hence is used in this implementation.

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {10,5,6,4,3,2,1};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }


    public static void quickSort(int[] arr, int start, int end){
        //base condition
        if(start >= end){
            return;
        }

        //choose a pivot (here, middle element will act as pivot)
        int mid = start+(end-start)/2;
        int pivot = arr[mid];

        //sorting the pivot into its correct position
        int i = start;
        int j = end;

        while(i<=j){
            while(arr[i] < pivot){
                i++;
            }

            while(arr[j] > pivot){
                j--;
            }

            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }
        //recursive calls
        quickSort(arr,start,j);
        quickSort(arr,i,end);


    }

}
