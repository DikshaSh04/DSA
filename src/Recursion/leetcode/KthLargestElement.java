package Recursion.leetcode;
//Q: https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {10,8,9,5,2,3,1};
        int k = 3;
        System.out.println(kthLargest(nums,k));

    }

    public static int kthLargest(int[] arr, int k){
        int targetIndex = arr.length - k;
        return quickSelect(arr,targetIndex,0,arr.length-1);


    }

    public static int quickSelect(int[] arr, int targetIndex, int start, int end){
        //base condition
        if(start>=end){
            return arr[end];
        }
        //take middle element as pivot
        int mid = start+(end-start)/2;
        int pivot = arr[mid];

        //take two pointers at the start and end for partitioning (sorting around the pivot)
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
        //check which of the two recursive calls to be made depending on condition:

        if(targetIndex <= j){
            return quickSelect(arr, targetIndex, start, j);
        }
        else if(targetIndex >= i){
            return quickSelect(arr, targetIndex, i, end);
        }
        else{
            return arr[targetIndex];
        }
    }
}
