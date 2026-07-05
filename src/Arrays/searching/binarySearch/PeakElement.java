package Arrays.searching.binarySearch;
// Q: https://leetcode.com/problems/find-peak-element/description/
public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(peak(arr));
    }

    public static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){ //we are either at the peak or in the decreasing part of array
                end = mid;           //so, save it and search in left.
            }
            else if(arr[mid]<arr[mid+1]){ //we are in the increasing part of array, not at peak
                start = mid + 1;          //so, search in right.
            }
        }
        return start;          //the peak must be at the index [start == end] when the loop terminates.
    }


}
