package ArrayAndString.TwoPointer;

import java.util.Arrays;

//Q: https://leetcode.com/problems/3sum-closest/description/
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(arr,target));

    }

    //1. Sort the array to use two pointers to make the sum closer to the target.
    //2. Fix an element at i and then take two pointers in the remaining array and
    //compute the sum of all three elements.
    //3. Then compute the absolute distance between the target and the sum.
    //4. If the distance is smaller than the minimum difference, then update
    //minimum difference.
    //5. Apply the logic, if sum<target, j++ to reach closer to target, or if sum>target
    //k-- to reach closer to target.

    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int resultSum=0;
        int minDifference = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            int sum = 0;
            while(j<k){
                sum = nums[i]+nums[j]+nums[k];
                int difference = Math.abs(target - sum);
                if(difference<minDifference){
                    resultSum = sum;
                    minDifference = difference;
                }

                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }

            }

        }
        return resultSum;

    }
}
