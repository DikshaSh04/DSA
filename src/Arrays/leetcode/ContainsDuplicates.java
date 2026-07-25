package Arrays.leetcode;

import java.util.HashSet;

//Q: https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,5,4};
        System.out.println(containsDuplicates(arr));

    }

    public static boolean containsDuplicates(int[] nums){
        //make a hashset of all elements of array
        //compare size of hashset and array
        //if same = false(no duplicates), if diff= true(array contains duplicates,
        // as set ignores duplicates)

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        if(hs.size()==nums.length){
            return false;
        }
        else{
            return true;
        }
    }
}
