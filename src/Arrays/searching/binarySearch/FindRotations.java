package Arrays.searching.binarySearch;
// Q: https://takeuforward.org/plus/dsa/problems/find-out-how-many-times-the-array-is-rotated?source=strivers-a2z-dsa-track
public class FindRotations {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findRotations(nums));

    }

//The number of times the array has been rotated = pivot index + 1 (logically)
    public static int findRotations(int[] nums){
        int pivot = pivot(nums);
        return pivot+1;
    }

    public static int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid!=nums.length-1 && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid!=0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]<nums[start]){
                end = mid-1;
            }
            else if(nums[mid]>=nums[start]){
                start = mid+1;
            }
        }
        return end;
    }
}