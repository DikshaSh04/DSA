package Recursion.practice.basic;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1482;
        reverseNum(num);

    }

    public static void reverseNum(int num){
        //base condition:
        if(num==0){
            return;
        }
        System.out.print(num%10);
        reverseNum(num/10);
    }
}
