package Arrays.searching.binarySearch;
//Q: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class SearchMinRotated {

    //logically, the minimum number in a rotated sorted array is the one
    //next to the pivot element (largest element).
    //Thus, find pivot then return the element next to it.

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2,3};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int pivot = pivot(nums);

        //EDGE CASE: what if the array is rotated as many times as the number of elements
        //eg: {1,2,3,4,5,6,7} -- the array is rotated 7 times

        if(pivot!=nums.length-1){
            return nums[pivot+1];
        }
        else{
            return nums[0];  //non-edge case
        }

    }

    public static int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid!=0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(mid!=nums.length-1 && nums[mid]>nums[mid+1]){
                return mid;
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
