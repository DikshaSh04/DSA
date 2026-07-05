package Arrays.searching.binarySearch;
// Q: Find the lower bound of a number i.e. smallest number >= target (x)
public class LowerBound {
    public static void main(String[] args) {
        int[] nums = {3,5,8,15,19};
        System.out.println(lowerBound(nums,9));
    }

    public static int lowerBound(int[] nums, int x){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]==x || nums[mid]>x){
                end = mid;
            }
            else if(nums[mid]<x){
                start = mid+1;
            }
        }
        return end;                 //can be done using 1st template [while(start<=end)]
                                    //same as finding ceiling, or here it is done using
                                    //2nd template[while(start<end)] and lower bound is at
                                    //(start==end) position after termination of loop
                                    //(so either start or end can be returned here).
    }
}
