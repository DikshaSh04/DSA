package Recursion.practice.basic;
//Q: Given an integer n, print all numbers from n to 1.
public class Nto1 {
    public static void main(String[] args) {
        printNum(5);

    }

    public static void printNum(int n){
        //base condition:
        if(n==0){
            return;
        }
        //LOGIC: First print the current n then call the func with next smaller no.
        System.out.println(n);
        printNum(n-1);

    }

}
