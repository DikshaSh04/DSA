package Recursion.practice.arrays;
//Q: Check whether a given array is sorted (in ascending order) or not using recursion.
public class IsSorted {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,8,9};
        System.out.println(isSorted(numbers));


    }

    //LOGIC: First compare the start element with start+1 element
    //If order does not match, return false
    //Else make the next function call with start = start+1

    public static boolean isSorted(int[] nums){
        return helper(nums,0);

    }

    public static boolean helper(int[] nums, int start){
        //base condition
        if(start==nums.length-1){
            return true;
        }
        if(nums[start] > nums[start+1]){
            return false;
        }
        return helper(nums,start+1);

    }

}

