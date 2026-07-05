package Arrays.searching.binarySearch;
//Q: Find the Floor of a number i.e. greatest number <=target
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] nums={5,8,11,12,14,17,29,50};
        System.out.println(floor(nums,16));
    }

    public static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;               //floor lies at the end index after termination of loop
                                  //when start>end (start=end+1)

    }
}
