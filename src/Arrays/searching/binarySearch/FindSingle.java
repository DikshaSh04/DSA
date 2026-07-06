package Arrays.searching.binarySearch;
// Q : https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class FindSingle {
    //it can be logically seen that:
    //all duplicate pairs BEFORE the single element are in even-odd indexes
    //all duplicate pairs AFTER the single element are in odd-even indexes

    //1. mid is even + next is duplicate : move right by 2
    //2. mid is even + next  is not duplicate : ans can be mid or left
    //3. mid is odd + previous is duplicate : move right by 1
    //4. mid is odd + previous is not duplicate : ans can be mid or left

    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(single(nums));
    }

    public static int single(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid%2==0 && mid!=nums.length-1){
                if(nums[mid]==nums[mid+1]){
                    start = mid+2;
                }
                else{
                    end = mid;
                }
            }
            else if(mid%2!=0){
                if(nums[mid]==nums[mid-1]){
                    start = mid+1;
                }
                else{
                    end = mid;
                }

            }
        }
        return nums[end];
    }
}
