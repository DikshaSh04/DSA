package Recursion.leetcode;

import java.util.ArrayList;
import java.util.List;

//Q: https://leetcode.com/problems/permutations/description/

public class PermutationsI {
    public List<List<Integer>> permute(int[] nums) {
        return helper(new ArrayList<>(),nums,0);

    }

    public static List<List<Integer>> helper(List<Integer> local,int[] nums, int idx){
        //final list storing answers from all calls
        List<List<Integer>> result = new ArrayList<>();

        //base condition
        if(idx == nums.length){
            result.add(new ArrayList<>(local));
            return result;
        }

        //number of function calls at each level(diff at each level)
        int n = local.size()+1;
        //element to be fixed in current call
        Integer num = nums[idx];

        //loop will run n times
        for(int i=0; i<n; i++){
            //making a choice
            local.add(i,num);
            //exploring all ans with this choice
            List<List<Integer>> ans = helper(local,nums,idx+1);
            //add these answers to result
            result.addAll(ans);
            //backtrack (un-do)
            local.remove(i);
        }

        return result;

    }
}
