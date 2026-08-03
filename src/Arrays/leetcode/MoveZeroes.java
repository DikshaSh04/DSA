package Arrays.leetcode;

import java.util.Arrays;
//BRUTE FORCE APPROACH (did before learning two pointers)
//Time complexity - O(n^2)
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,3,0,4,5};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void moveZeroes(int[] nums) {

        for(int pass=1;pass<nums.length;pass++){
            for(int i=0;i<nums.length-pass;i++){

                if(nums[i]==0){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;


                }
            }
        }



    }
}
