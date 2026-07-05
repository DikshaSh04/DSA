package Arrays.searching.binarySearch;

//when we don't know the order in which array is sorted

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums={8,7,6,5,4,3,2,1,0};
        int result=oaBinarySearch(nums,7);
        if(result==-1){
            System.out.println("Target not found!");
        }
        else{
            System.out.println("Target found at index: "+result);
        }
    }


    public static int oaBinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAscending=arr[start]<arr[end];


        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return mid;
            } //case common to both ascending and descending order


            if(isAscending){
                    if(target<arr[mid]){
                        end=mid-1;
                    } else if (target>arr[mid]) {
                        start=mid+1;

                    }   //binary search for ascending order
                }

            else{
                    if(target<arr[mid]){
                        start=mid+1;
                    }
                    else if(target>arr[mid]){
                        end=mid-1;
                    }
                } //binary search for descending order

        }

        return -1;

    }




}


