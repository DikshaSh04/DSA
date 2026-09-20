package Recursion.leetcode;

import java.util.Arrays;

//Q: https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {5,6,7,0,0,0};
        int[] arr2 = {1,2,3};
        merge(arr1,3,arr2,3);
        System.out.println(Arrays.toString(arr1));

    }
    //LOGIC: Works exactly as the "merge" part of merge sort algorithm.

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m+n];

        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                result[k] = nums1[i];
                i++;
            }
            else{
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i<m){
            result[k] = nums1[i];
            i++;
            k++;
        }

        while(j<n){
            result[k] = nums2[j];
            j++;
            k++;
        }

        for(k=0; k<result.length; k++){
            nums1[k] = result[k];
        }

    }
}
