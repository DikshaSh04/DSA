package ArrayAndString.TwoPointer;
//Q: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
//TWO POINTERS - fast/slow pointers - same direction
public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums) {
        //take a slow pointer that visits every element one by one
        //take a fast pointer that increments everytime the elements at
        //both indices match.
        //when there is a mismatch, replace the element AFTER slow pointer with
        //the element at fast pointer and increment both
        //when the fast pointer exceeds the array, the position of the slow
        //pointer is equal to the number of unique k elements
        int slow = 0;
        int fast = 1;

        while(fast<nums.length){
            if(nums[slow]==nums[fast]){
                fast++;
            }
            else{
                nums[slow+1] = nums[fast];
                slow++;
                fast++;
            }
        }
        return slow+1;

    }

}
