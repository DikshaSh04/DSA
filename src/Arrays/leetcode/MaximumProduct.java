package Arrays.leetcode;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = {3,7};
        System.out.println(maxProduct(nums));

    }
//APPROACH 2: NOT THE MOST EFFICIENT APPROACH
    public static int maxProduct(int[] nums){
        //first sort using bubble sort
        for(int i=1;i<nums.length;i++){
            boolean swap=false;
            for(int j=0;j<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
        //then access the max and second max values and put into expression.
        int i=nums.length-1;
        int j=i-1;
        return ((nums[i]-1)*(nums[j]-1));
    }












    //MORE EFFICIENT APPROACH BUT I DID NOT IMPLEMENT IT CORRECTLY:
    //Approach 1: I tried to find max and second max element then put it into required expression.
    //Does not work for every test case for example nums={3,7}

//    public static int maxProduct(int[] nums) {
//        int maxValIndex=0;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]>nums[maxValIndex]){
//                maxValIndex=i;
//            }
//        }
//        int secondMaxIndex=nums.length-1;
//        for(int j=nums.length-1;j>=0;j--){
//            if(j!=maxValIndex && nums[j]>nums[secondMaxIndex]){
//                secondMaxIndex=j;
//            }
//        }
//        int i=maxValIndex;
//        int j=secondMaxIndex;
//
//        return ((nums[i]-1)*(nums[j]-1));
//
//
//
//    }

    //CORRECT IMPLEMENTATION OF ABOVE CODE IS IN CLASS: MaximumProduct2




}
