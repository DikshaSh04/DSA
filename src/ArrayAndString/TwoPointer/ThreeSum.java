package ArrayAndString.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q: https://leetcode.com/problems/3sum/description/
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4}; //{-4,-1,-1,0,1,2}
        System.out.println(threeSum(nums));

    }

    //1. Fix one element at i and then compute the target that should be
    // added to it for the sum to become = 0.
    //2. Search the remaining array ahead for 2 elements that add up to the target.
    //3. This reduces the problem to classic 2Sum problem, sort the array beforehand
    //to make use of two pointers instead of hashmap to solve 2Sum problem.
    //4. Add a duplicate check for i,j and k if current element is same as previous
    //element, skip it as it will produce the same list.

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            //duplicate check for i
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = 0 - nums[i];
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                if(nums[j]+nums[k]==target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;
                    k--;

                    //duplicate check for j
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    //duplicate check for k
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }

                }
                else if(nums[j]+nums[k]<target){
                    j++;
                }
                else{
                    k--;
                }
            }

        }
        return result;

    }
    
}
