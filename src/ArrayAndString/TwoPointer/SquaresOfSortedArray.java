package ArrayAndString.TwoPointer;

import java.util.Arrays;

//Q: https://leetcode.com/problems/squares-of-a-sorted-array/description/
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squares(arr)));

    }
    //CORE LOGIC: Since the input array is sorted, the largest element that will land
    //at the end of the resultant array will be the square of either the first or last
    //element of input array.
    //1. Make a result array of same size as input array.
    //2. Take two pointers at start and end of input array and compare their squares.
    //3. The one with greater square will go straight at the end of result array, and
    //the the pointer of element that got added to result array moves.

    public static int[] squares(int[] nums){
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length-1;

        for(int i=result.length-1; i>=0;i--){
            int square1 = nums[start] * nums[start];
            int square2 = nums[end] * nums[end];
            if(square1 > square2){
                result[i] = square1;
                start++;
            }
            else{
                result[i] = square2;
                end--;
            }

        }
        return result;


    }
}
