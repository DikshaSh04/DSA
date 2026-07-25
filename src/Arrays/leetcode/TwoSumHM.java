package Arrays.leetcode;
//Q: https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;
import java.util.HashMap;

//This is optimised solution using HashMaps - Time Complexity: O(n)
public class TwoSumHM {
    public static void main(String[] args) {
        int[] arr = {3,4,2};
        System.out.println(Arrays.toString(twoSumHm(arr,6)));

    }

    public static int[] twoSumHm(int[] nums, int target){
        //array that stores result
        int[] result = new int[2];
        //hashmap that stores keys(elements of array) and values(their indices)
        HashMap<Integer,Integer> hm = new HashMap<>();

        int firstIndex = -1;
        int secondIndex = -1;

//if hashmap contains n, return n's index and current index, otherwise put
//current element as key and its index as value.

        for(int i=0; i<nums.length; i++){
            int n = target - nums[i];
            if(hm.containsKey(n)){
                firstIndex = hm.get(n);
                secondIndex = i;
                break;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        result[0] = firstIndex;
        result[1] = secondIndex;

        return result;


    }
}
