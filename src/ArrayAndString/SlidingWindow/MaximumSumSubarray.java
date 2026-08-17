package ArrayAndString.SlidingWindow;
//Find the maximum sum of subarray of size K from a given array of size n


public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,-5,6,4,3,8,-1,0,9};
        int k = 4;
        System.out.println(slidingWindow(arr,k));

    }

    //BRUTE FORCE APPROACH - Time Complexity O(n^2)
    public static int maxSumSubarray(int[] arr, int k){
        if(k>arr.length || k<=0){
            return -1;
        }
        int resultSum = Integer.MIN_VALUE;
        int start = 0;
        int end = start + (k-1);

        while(end < arr.length){
            int sum=0;
            for(int i=start; i<=end; i++){
                sum+=arr[i];
            }
            if(sum>resultSum){
                resultSum = sum;
                start++;
                end++;
            }
            else{
                start++;
                end++;
            }
        }
        return resultSum;


    }

    //OPTIMISED APPROACH - Sliding Window - Time complexity O(n)

    //1.take sum of first window
    //2.keep adding 1 element, removing 1 element, instead of taking sum of each window
    //everytime

    public static int slidingWindow(int[] arr, int k){
        if(k>arr.length || k<=0){
            return -1;
        }
        int resultSum;
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum+=arr[i];
        }
        resultSum = sum;
        for(int i = 0; i<arr.length-k; i++){
            int j = i + (k-1);
            sum = sum + arr[j+1] - arr[i];

            if(sum>resultSum){
                resultSum = sum;
            }

        }
        return resultSum;
    }
}
