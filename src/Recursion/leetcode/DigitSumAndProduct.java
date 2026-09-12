package Recursion.leetcode;
//Q: https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/description/
public class DigitSumAndProduct {
    public static void main(String[] args) {
        int num = 99;
        System.out.println(checkDivisibility(num));
    }

    public static boolean checkDivisibility(int n) {
        int resultSum = sumDigits(n) + productDigits(n);
        if(n%resultSum == 0){
            return true;
        }
        else{
            return false;
        }

    }

    public static int sumDigits(int num){
        //base condition
        if(num/10 == 0){
            return num;
        }
        //recurrence relation
        return (num%10)+sumDigits(num/10);
    }

    public static int productDigits(int num){
        //base condition:
        if(num/10 == 0){
            return num;
        }
        //recurrence relation:
        return (num%10)*productDigits(num/10);

    }
}
