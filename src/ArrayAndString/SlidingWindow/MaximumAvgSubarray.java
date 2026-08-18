package ArrayAndString.SlidingWindow;
//Q: https://leetcode.com/problems/maximum-average-subarray-i/description/
public class MaximumAvgSubarray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(avgSubarray(nums,k));

    }

    //1. For finding maximum avg, we need maximum sum. So find out maximum sum
    //using sliding window technique, then return the maximumSum/k for avg

    public static double avgSubarray(int[] nums, int k){
        int maxSum;
        int currentSum = 0;
        for(int i=0; i<k; i++){
            currentSum+=nums[i];  //found sum of first window
        }
        maxSum = currentSum;

        for(int i=0; i<nums.length-k; i++){
            currentSum = currentSum + nums[i+k] - nums[i];  //update the sum for next window

            if(currentSum>maxSum){
                maxSum = currentSum;   //if sum of current window > sum of any previous window
                                       //then update max sum
            }
        }

        return (double) maxSum/k;      //return avg


    }
}
