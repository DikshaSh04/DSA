package Arrays.sorting.implementation;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 2, 3};
        selection(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void selection(int[] arr) {
        for (int pass = 1; pass < arr.length; pass++) {
            int firstIndex = pass - 1;
            int minValIndex = getMinIndex(arr, firstIndex);

            int temp = arr[firstIndex];
            arr[firstIndex] = arr[minValIndex];
            arr[minValIndex] = temp;
        }
    }

    public static int getMinIndex(int[] arr, int start) {
        int minIndex = start;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;

            }
        }

        return minIndex;
    }

}

//mistake: Was swapping multiple times in one pass, that is wrong,
// in selection sort, find the min/max element and then swap ONCE in a pass.

//public static void selectionSort(int[] arr){
//    for(int p=1;p<arr.length;p++){
//        for(int i=p;i<arr.length;i++){
//            if(arr[i]<arr[p-1]){
//
//                int temp=arr[i];
//                arr[i]=arr[p-1];
//                arr[p-1]=temp;
//
//            }


