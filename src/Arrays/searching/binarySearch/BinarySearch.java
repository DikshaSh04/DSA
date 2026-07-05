package Arrays.searching.binarySearch;

//Q: https://leetcode.com/problems/binary-search/description/

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};

        int result=binarySearch(nums,3);
        if(result!=-1){
            System.out.println("Target found at index: "+result);
        }
        else{
            System.out.println("Target not found");
        }

    }

    public static int binarySearch(int[] arr, int target){
        int low=0;
        int high=arr.length-1;

        while(low<=high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
}

//mistake I did: could not think of while(low<=high)
