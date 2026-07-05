package Arrays.searching.binarySearch;
// Q: https://leetcode.com/problems/search-insert-position/description/
public class InsertSearchPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(insertSearch(arr,7));
    }

    public static int insertSearch(int[] nums, int target){
        int start = 0;
        int end  = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;    //after last iteration (start == end), the loop will exit
                         //when start>end (start=end+1) and start will be at the
                         //index where the element SHOULD be inserted to maintain
                         //the order.
    }

}
