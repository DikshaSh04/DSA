package Arrays.leetcode;
//algorithm used: linear search
public class CountEven {
    public static void main(String[] args) {
           int[] arr={1234,3,62, 356};

        System.out.println(findNumbers(arr));


    }


    public static int findNumbers(int[] nums){
        
        //global counter
        int countNum=0;

        //loop
        for(int i=0;i<nums.length;i++){
            //create array of digits
            char[] digits=String.valueOf(nums[i]).toCharArray();

            int countDigits=digits.length;

            if(countDigits%2==0){
                countNum+=1;
            }

        }

        return countNum;




    }

}
