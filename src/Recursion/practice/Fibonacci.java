package Recursion.practice;
//Q: Find the nth fibonacci number using recursion.
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(3));


    }

    public static int fibo(int n){
        //base condition:
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        //recurrence relation:
        return fibo(n-1) + fibo(n-2);

    }
}
