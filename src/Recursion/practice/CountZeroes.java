package Recursion.practice;
//Q: Count the number of times 0 appears in a number n.
public class CountZeroes {
    public static void main(String[] args) {
        int num = 20103;
        System.out.println(countZero(num));
    }

    //LOGIC: Pass the count in the function argument only
    //if the last digit is 0, call the function with n/10 and count+1
    //if the last digit is not 0, call the next function with count only

    public static int countZero(int num){
        return helper(num,0);
    }
    //Use a helper function to do the work then the countZero function for passing the count

    public static int helper(int num, int count){
        //base condition
        if(num == 0){
            return count;
        }

        if(num%10 == 0){
            return helper(num/10,count+1);
        }
        else{
            return helper(num/10,count);
        }


    }
}
