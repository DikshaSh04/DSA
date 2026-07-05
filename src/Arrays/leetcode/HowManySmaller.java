package Arrays.leetcode;

import java.util.Arrays;

public class HowManySmaller {
    public static void main(String[] args) {
        int[] nums={7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(j!=i && nums[j]<nums[i]){
                    count++;
                }
            }
            arr[i]=count;


        }
        return arr;
    }
}
