package ArrayAndString.TwoPointer;
//Q: https://leetcode.com/problems/valid-palindrome-ii/description/
//TWO POINTERS - converging pointers
public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "acucucubucucucua";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        //perform normal two pointer palindrome check first
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            //when there is a mismatch, check both possible strings after removing a char
            //if both are possible, true is returned, even if one is possible true is returned (due to OR ||)
            //if both are false then false is returned.
            else{
                return isPalindrome(s,start+1,end) || isPalindrome(s,start,end-1);

            }
        }
        return true;
    }

    //function that checks palindrome IN A GIVEN RANGE i.e. not including the
    //removed character
    public static boolean isPalindrome(String s, int startPointer, int endPointer){
        while(startPointer<endPointer){
            if(s.charAt(startPointer) == s.charAt(endPointer)){
                startPointer++;
                endPointer--;
            }
            else{
                return false; //because if the string is not palindrome even after removing a char, then return false
            }
        }
        return true;
    }
}
