package Arrays.searching.binarySearch;
// Q: Find the upper bound of the number i.e. smallest number >target(x).
public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        System.out.println(upperBound(arr,9));

    }

    public static int upperBound(int[] nums, int x){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]==x || nums[mid]<x){
                start = mid+1;
            }
            else if(nums[mid]>x){
                end = mid;
            }
        }
        return end;
    }
}
