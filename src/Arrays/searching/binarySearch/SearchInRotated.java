package Arrays.searching.binarySearch;
// Q: https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotated {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(rotatedSearch(nums,0));
    }
// The following method works only for rotated sorted array having NO DUPLICATES.
// 1. Find pivot
// 2. Binary search before pivot.
// 3. If not found, binary search after pivot.
// 4. If not found, return -1.

    public static int rotatedSearch(int[] nums, int target){
        int pivot = pivot(nums);
        int start = 0;
        int end = pivot;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        start = pivot+1;
        end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;


    }

    public static int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid!=nums.length-1 && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid!=0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]<nums[start]){
                end = mid-1;
            }
            else if(nums[mid]>=nums[start]){
                start = mid+1;
            }
        }
        return end;
    }
}
