package Arrays.sorting.questions;

//Q: You are given an array of integers that is almost sorted
// every element is at most k positions away from its correct sorted position.
//Sort the array in ascending order.

import java.util.Arrays;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] nums={3, 2, 1, 5, 4, 7, 6, 5};

        sortNums(nums,2);

        System.out.println(Arrays.toString(nums));
    }

    public static void sortNums(int[] arr,int k){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && j>=i-k-1 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;


        }

    }
}
