package Arrays.sorting.implementation;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {55, 33, 28, 1, 4,0,-1};

        insertion(nums);
        System.out.println(Arrays.toString(nums));


    }

    public static void insertion(int[] arr) {
        for(int i=1;i<arr.length;i++){//i is the index of key element
            int key=arr[i];

            int j=i-1;
            while(j>=0 && key<arr[j]) {
                arr[j+1]=arr[j];

                j--;
            }

            arr[j+1]=key;

            }



        }


    }


