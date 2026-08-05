package ArrayAndString.TwoPointer;
//Q: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

//Approach a little better than 0(n^2) - Time complexity O(n log n)
//OPTIMISED APPPROACH - SEE LC - Time Complexity O(n)
public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
    //fix one element and determine what other element is needed
    //then apply binary search in the remaining array to look for that element
    //if not found, fix the next element and repeat
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        for(int i=0; i<numbers.length; i++){
            int toFind = target - numbers[i];
            int start = i+1;
            int end = numbers.length-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(numbers[mid] == toFind){
                    result[0] = i+1;
                    result[1] = mid+1;
                    return result;
                }
                else if(numbers[mid]<toFind){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return result;
    }


}
