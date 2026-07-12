package Strings.practice;
// Q: Check whether given string is palindrome or not.
public class Palindrome {

    public static void main(String[] args) {
        String s1 = "abdba";
        System.out.println(checkPalindrome(s1));

    }
    //two pointer method: take two pointers start and end
    //move pointers if characters are identical.
    public static boolean checkPalindrome(String s){
        int start = 0;
        int end = s.length()-1;

        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
