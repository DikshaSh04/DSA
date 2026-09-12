package Recursion.leetcode;
//Q: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class NoOfSteps {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));

    }

    //LOGIC: Use a helper function that takes the number and the step count in the arguments
    //apply the logic given in question and the base condition

    public static int numberOfSteps(int num) {
        return helper(num,0);

    }

    public static int helper(int n, int stepCount){
        //base condition
        if(n==0){
            return stepCount;
        }

        if(n%2==0){
            return helper(n/2,stepCount+1);
        }
        else{
            return helper(n-1,stepCount+1);
        }

    }
}
