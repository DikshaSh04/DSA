package Recursion.practice.arrays;

import java.util.ArrayList;
import java.util.List;

//Q: Return a List of indexes of the occurrences of a target in a given array
//Without passing list in the argument or creating any globally declared list.
public class IMPConcept {
    public static void main(String[] args) {
        int[] nums = {2,1,2,4,2};
        System.out.println(searchOccurrence(nums,2,0));
    }
    
    //LOGIC: 1. Create a new list in the body of the function for every function call.
    // 2. When a base condition hits, the last function call returns a list, which is stored
    //in a new list data structure in the body of the function, then added to the original list
    //using addAll() function that adds one list to another list.
    //THEREFORE, a new list is created for every function call, then while coming out of
    //the call stack, if the individual list has something to add to the main list, it gets
    //added otherwise not.

    public static List<Integer> searchOccurrence(int[] arr, int target, int start){
        //new list for every function call
        List<Integer> result = new ArrayList<>();

        //base condition
        if(start == arr.length){
            return result;
        }
        if(arr[start] == target){
            result.add(start);
        }

        //List that stores data from below function calls
        List<Integer> resultOfCallsFromBelow = searchOccurrence(arr,target,start+1);

        //add the result of below calls to main result list
        result.addAll(resultOfCallsFromBelow);
        //then return the merged ans
        return result;
    }
}
