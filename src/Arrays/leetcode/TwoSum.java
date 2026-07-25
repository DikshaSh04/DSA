package Arrays.leetcode;
//Q: https://leetcode.com/problems/two-sum/description/
//Solving using brute force approach - Time Complexity O(n^2)

//Optimised method - using HashMap

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,4,2};
        System.out.println(Arrays.toString(twoSum(arr,6)));

    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        int firstIndex = -1;
        int secondIndex = -1;
        boolean found = false;

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    firstIndex = i;
                    secondIndex = j;
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        result[0] = firstIndex;
        result[1] = secondIndex;

        return result;


    }
}
