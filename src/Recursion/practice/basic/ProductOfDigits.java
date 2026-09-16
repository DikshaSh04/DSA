package Recursion.practice.basic;
//Q: Calculate the product of digits of a number n.
public class ProductOfDigits {
    public static void main(String[] args) {
        int num = 1345;
        System.out.println(productDigits(num));

    }

    public static int productDigits(int n){
        //base condition: (if n is 1 digit only (n/10==0 for 1 digit no.), return the no.)
        if(n/10 == 0){
            return n;
        }
        return (n%10) * productDigits(n/10);
    }

}
