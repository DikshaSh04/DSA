package Arrays.sorting.questions;

// Q: You are given an array of integers.
// Find the kth smallest element in the array without fully sorting it.

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] nums={7, 10, 4, 3, 20, 15};

        System.out.println(findKthSmallest(nums,4));


    }

    public static int findKthSmallest(int[] arr,int k){

        for(int i=0;i<arr.length;i++) {
            int minindex = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;

            if (i + 1 == k) {
                return arr[i];
            }


        }
        return 0;


    }





    }

