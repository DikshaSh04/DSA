package Recursion.practice.basic;
//Q: Calculate the sum of digits of a number n
public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123451;
        System.out.println(sumDigits(n));


    }

    //LOGICAL: recurrence relation is just sum(n) = last digit + sum(n without last digit)
    //last digit can be extracted by n%10
    //n without last digit can be extracted by n/10
    // hence the recurrence relation => sum(n) = n%10 + sum(n/10)

    public static int sumDigits(int n){
        //base condition:
        if(n==0){
            return 0;
        }

        //recurrence relation:
        return n%10 + sumDigits(n/10);

    }
}
