package StringsAndHashing.leetcode;

import java.util.Arrays;

// Q: https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverse(s);
        System.out.println(Arrays.toString(s));

    }
    //take two pointers, swap them with each other while moving inward.


    public static void reverse(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }


    }
}
