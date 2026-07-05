package Arrays.searching.binarySearch;
//Q: Find the index of pivot element (largest element) in a rotated sorted array.
public class FindPivot {
    public static void main(String[] args) {
        int[] nums = {4,5,0,1};
        System.out.println(pivot(nums));

    }

    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid!=arr.length-1 && arr[mid]>arr[mid+1]){
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

        return end;
    }
}
