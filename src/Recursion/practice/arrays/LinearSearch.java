package Recursion.practice.arrays;
//Q: Search for a target in the given array using recursion.
public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {3,6,2,6,14,7};
        System.out.println(search(numbers,6));

    }
    //LOGIC: First check the start element if it is equal to target, if yes, return start
    //else call next function with start = start+1

    public static int search(int[] arr, int target){
        return helper(arr,target,0);

    }

    public static int helper(int[] arr, int target, int start){
        //base condition:
        if(start == arr.length){
            return -1;
        }
        if(arr[start] == target){
            return start;
        }
        return helper(arr,target,start+1);
    }
}
