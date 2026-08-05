package ArrayAndString.TwoPointer;
//Q: https://leetcode.com/problems/sort-array-by-parity/description/
public class SortArrayByParity {
    public static void main(String[] args) {


    }
    public int[] sortArrayByParity(int[] nums) {
        //take two pointers slow and fast
        //if element at fast is odd -> increment fast pointer
        //if not, swap the elements at slow and fast pointers
        int slow = 0;
        int fast = 0;

        while(fast<nums.length){
            if(nums[fast]%2!=0){
                fast++;
            }
            else{
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
                fast++;
            }
        }
        return nums;

    }
}
