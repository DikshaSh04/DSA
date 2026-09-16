package Recursion.practice.arrays;
//Q: Search for a target in a given rotated sorted array using recursion.
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,1,2,3};
        System.out.println(rotatedBS(nums,2));

    }

    public static int rotatedBS(int[] arr, int target){
        return binarySearch(arr,target,0,arr.length-1);

    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        int mid = start + (end-start)/2;
        //base case
        if(start>end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        //case1
        else if(arr[start] < arr[mid]){
            if(arr[start]<=target && arr[mid]>target){
                return binarySearch(arr,target,start,mid-1);
            }
            else{
                return binarySearch(arr,target,mid+1,end);
            }
        }
        else{
            if(arr[mid]<target && arr[end]>=target){
                return binarySearch(arr, target, mid+1, end);
            }
            else{
                return binarySearch(arr,target,start,mid-1);
            }
        }

    }
}
