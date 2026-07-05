package Arrays.leetcode;

//algorithm i used: bubble sort

import java.util.Arrays;
public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,1,0,1,2,2,0};

        sortColors(arr);

        System.out.println(Arrays.toString(arr));


    }

    public static void sortColors(int[] nums) {

        for(int pass=1;pass<nums.length;pass++){
            boolean swapped=false;
            for(int i=0;i<nums.length-pass;i++){
                if(nums[i]>nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;

                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }

    //optimal algorithm: Dutch National Flag Algorithm - O(n)

}
