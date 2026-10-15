package Arrays.leetcode;


import java.util.Arrays;
public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,1,0,1,2,2,0};

        sortColors(arr);

        System.out.println(Arrays.toString(arr));

    }

    //OPTIMAL: Dutch National Flag Algorithm - O(n)

    public static void sortColors(int[] nums){
        //take 3 pointers start, middle, end
        //iterate over the array using middle pointer
        //if 0 is encountered -> swap w start and move start and middle ahead
        //if 1 is encountered -> just move middle ahead
        //if 2 is encountered -> swap w end and move end behind

        int start = 0;
        int middle = 0;
        int end = nums.length-1;

        while(middle<=end){
            if(nums[middle] == 0){
                int temp = nums[start];
                nums[start] = nums[middle];
                nums[middle] = temp;
                start++;
                middle++;
            }
            else if(nums[middle] == 1){
                middle++;
            }
            else{
                int temp = nums[end];
                nums[end] = nums[middle];
                nums[middle] = temp;
                end--;
            }
        }
    }




//USING BRUTE FORCE - Bubble sort O(n^2)
//    public static void sortColors(int[] nums) {
//
//        for(int pass=1;pass<nums.length;pass++){
//            boolean swapped=false;
//            for(int i=0;i<nums.length-pass;i++){
//                if(nums[i]>nums[i+1]){
//                    int temp=nums[i];
//                    nums[i]=nums[i+1];
//                    nums[i+1]=temp;
//
//                    swapped=true;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//        }
//
//    }



}
