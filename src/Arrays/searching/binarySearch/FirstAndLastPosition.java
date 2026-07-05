package Arrays.searching.binarySearch;

import java.util.Arrays;

// Q: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(firstAndLast(nums,8)));


    }
    public static int[] firstAndLast(int[] nums, int target){
        int[] result = new int[2];
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);
        return result;

        //created an array of size 2 and initialized both indices
        //with first and last position respectively.

    }

    public static int findFirst(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int first=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                first = mid;
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return first;



    }

    public static int findLast(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int last = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
               last = mid;
               start = mid+1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
       return last;

    }

}
// used the 'save and continue searching' template to find first and last occurrence.