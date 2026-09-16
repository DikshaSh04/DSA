package Recursion.practice.arrays;

import java.util.ArrayList;
import java.util.List;

//Q: Return a list of all the indices having element equal to target.
public class LinearSearchOccurrences {
    public static void main(String[] args) {
        int[] nums = {1,4,2,4,3,5,4};
        System.out.println(searchIndices(nums,4));

    }
    //VERY IMP: GLOBALLY DECLARED LIST (should be static to use inside functions)
    //IF YOU DONT WANT TO MAKE A GLOBAL VARIABLE, then pass the arraylist as an argument
    //and keep modifying it with every function call like we did in CountZeroes problem
    static List<Integer> listIndex = new ArrayList<>();

    public static List<Integer> searchIndices(int[] arr, int target){
        return helper(arr,target,0);

    }

    public static List<Integer> helper(int[] arr, int target, int start){
        //base condition
        if(start==arr.length){
            return listIndex;
        }
        if(arr[start] == target){
            listIndex.add(start);
        }
        return helper(arr,target,start+1);
    }

}
