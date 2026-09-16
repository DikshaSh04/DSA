package Recursion.practice.basic;
//Q: Given an integer n, print all numbers from 1 to n.
public class OneToN {
    public static void main(String[] args) {
        printN(4);

    }

    public static void printN(int n){
        //base condition:
        if(n==0){
            return;
        }
        //LOGIC: first keep calling the next smaller no. then print
        printN(n-1);
        System.out.println(n);

    }

}
