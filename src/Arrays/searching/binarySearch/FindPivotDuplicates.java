package Arrays.searching.binarySearch;
// Q: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class FindPivotDuplicates {
    //we have to find pivot element in a rotated sorted array having duplicate elements.
    //same code as finding pivot without duplicates but handle a few edge cases that
    //arise due to duplicates.

    public static void main(String[] args) {
        int[] nums = {4};
        System.out.println(pivotDup(nums));
    }



    public static int pivotDup(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            //case to handle if start,end,mid have duplicate values
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                //case to handle single element array
                if(start==mid && start==end){ //i.e. all are at same index
                    return mid;
                }
                if(arr[start]>arr[start+1]){  //check if  start is the pivot before skipping
                    return start;
                }
                start++;   //when start is not pivot, skip it

                if(arr[end]<arr[end-1]){  //check if end is the pivot before skipping
                    return end-1;
                }
                end--;    //when end is not pivot, skip it
            }

            //normal code for finding pivot
            else if(mid!=arr.length-1 && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid!=0 && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<arr[start]){
                end = mid-1;
            }
            else if(arr[mid]>=arr[start]){
                start = mid+1;
            }
        }
        return start;
    }

}
