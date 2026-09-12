package Recursion.practice;
//Q: Calculate the factorial of a given number n.
public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }

    public static int fact(int n){
        //base condition:
        if(n<=1){
            return 1;
        }
        //recurrence relation:
        return n*fact(n-1);
    }
}
