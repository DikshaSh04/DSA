package Recursion.leetcode;
//Q: https://leetcode.com/problems/add-digits/description/
public class AddDigits {
    public static void main(String[] args) {
        int num = 542;
        System.out.println(addDigits(num));


    }

    public static int addDigits(int num) {
        int resultSum = sumDigits(num);

        //if resultSum has more than 1 digit, do all the work again but
        //with taking num = resultSum

        if(resultSum/10 > 0){
            return addDigits(resultSum);
        }

        return resultSum;
    }

    //function to return sum of digits of a number
    public static int sumDigits(int n){
        //base condition:
        if(n==0){
            return 0;
        }
        //recurrence relation:
        return (n%10) + sumDigits(n/10);
    }


}
