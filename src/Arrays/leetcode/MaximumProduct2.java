package Arrays.leetcode;

public class MaximumProduct2 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums){
        int maxVal=0;
        int maxVal2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=maxVal){
                maxVal2=maxVal;
                maxVal=nums[i];
            }
            else if(nums[i]>maxVal2 && nums[i]!=maxVal){
                maxVal2=nums[i];
            }

        }
        return ((maxVal-1)*(maxVal2-1));
    }

}
