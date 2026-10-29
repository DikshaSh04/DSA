package ArrayAndString.PrefixSum;
//Q: https://leetcode.com/problems/range-sum-query-immutable/description/
public class RangeSumQuery {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1};
        System.out.println(sumRange(arr,0,2));

    }

    public static int sumRange(int[] arr, int left, int right){
        //prefix sum array
        int[] sumArr = new int[arr.length];

        int sum = 0;

        //initialize the prefix sum array with cumulative sums
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            sumArr[i] = sum;
        }
        //sum of elements between left and right (both inclusive)
        //EDGE CASE : if left = 0 then sumArr[left] will give error
        if(left==0){
            return sumArr[right];
        }
        //GENERAL CASE
        return sumArr[right] - sumArr[left-1];
    }
}
