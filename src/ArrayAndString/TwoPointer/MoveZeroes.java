package ArrayAndString.TwoPointer;
// Q: https://leetcode.com/problems/move-zeroes/description/
//Two pointers - fast/slow pointers - same direction.
import java.util.Arrays;
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,2,3,4,0,5,6};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void moveZero(int[] nums){
        //take two pointers, one that visits all non-zero elements (fast),
        //one that visits each element (slow).
        int fast = 0;
        int slow = 0;
        //if the fast pointer is at a 0, ignore and move forward
        //if not, swap elements at slow and fast pointers
        while(fast<nums.length){
            if(nums[fast]==0){
                fast++;
            }
            else{
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                fast++;
                slow++;
            }
        }


    }
}
