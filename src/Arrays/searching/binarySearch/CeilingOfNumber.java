package Arrays.searching.binarySearch;
// Q: Find the Ceiling of a number i.e. smallest number >=target
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] nums={5,10,12,14,15,29,40};
        System.out.println(ceil(nums,17));

    }

    public static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;         //after last iteration (start == end), the loop will exit
                              //when start>end (start=end+1) and start will be at the
                              //index where the element SHOULD be inserted to maintain
                              //the order (i.e index of the smallest element greater than target).
    }

}
