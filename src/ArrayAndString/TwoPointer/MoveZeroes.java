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
        //one that visits each element and changes its value (slow).
        int fast = 0;
        int slow = 0;
        //if the fast pointer is at a 0, ignore and move forward
        //if not, make the value at slow pointer equal to that at fast pointer
        while(fast<nums.length){
            if(fast!=nums.length-1 && nums[fast]==0){
                fast++;
            }
            else{
                nums[slow] = nums[fast];
                fast++;
                slow++;
            }
        }
        //when the fast pointer reaches the end of array, make every element of slow
        //pointer equal to 0
        while(slow<nums.length){
            nums[slow] = 0;
            slow++;
        }


    }
}
