package Arrays.searching.binarySearch;
// Q: https://takeuforward.org/plus/dsa/problems/count-occurrences-in-a-sorted-array?source=strivers-a2z-dsa-track
public class CountOccurrences {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 3};
        System.out.println(count(nums,0));

    }

    public static int count(int[] arr, int target){
        int firstOcc = firstOccurrence(arr, target);
        int lastOcc = lastOccurrence(arr, target);

        return (lastOcc-firstOcc)+1;   //find first occurrence, last occurrence, then the
                                       //required ans is this formula (logical).

    }

    public static int firstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int first = 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                first = mid;
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int last = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                last = mid;
                start = mid+1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return last;
    }



}
