package Recursion.practice;
//Binary Search using recursion
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {3,5,7,8,9};
        System.out.println(binarySearchRec(nums,0,nums.length-1,5));


    }

    //SOME IMPORTANT POINTS FOR RECURSION:
    //1. The arguments of the function should be those that will be passed in the next
    //in the next function call (eg: start and end must be passed in the next function call
    //to reduce the search space of array).

    //2. Always return the result of a function call if there is a return type/if function
    //is not void.

    public static int binarySearchRec(int[] arr, int start, int end, int target){
        //base condition: (if target not found)
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        //implicit base condition: (if target found)
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid] < target){
             return binarySearchRec(arr, mid+1, end, target);
        }
        else{
             return binarySearchRec(arr,start,mid-1, target);
        }
    }
}
