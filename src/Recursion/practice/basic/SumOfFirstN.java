package Recursion.practice.basic;
//Q: Calculate the sum of first n numbers (1 to n)
public class SumOfFirstN {
    public static void main(String[] args) {
        System.out.println(sum(5));

    }

    public static int sum(int n){
        //base condition:
        if(n==1){
            return 1;
        }
        //recurrence relation:
        return n+sum(n-1);
    }
}

