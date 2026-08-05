package ArrayAndString.TwoPointer;
//Q: https://leetcode.com/problems/remove-element/description/

//exactly same as move zeroes problem
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        //take two pointers, one that visits all non-val elements (fast),
        //one that visits each element (slow).
        int fast = 0;
        int slow = 0;
        //if the fast pointer is at element = val, ignore and move forward
        //if not, swap elements at slow and fast pointers
        while(fast<nums.length){
            if(nums[fast]==val){
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
        return slow;

    }
}
