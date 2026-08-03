package StringsAndHashing.leetcode;
//Q: https://leetcode.com/problems/length-of-last-word/description/
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World   ";

    }
    /*
    1. Start for loop from the end of string upto start of string.
    2. Check if the current character is empty space, if it is, and count = 0,
       then continue the loop.
    3. If an empty space is encountered but the count != 0, return count because
    it is the length of last word.
     */

    public static int lengthOfLastWord(String s){
        int count = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                count+=1;
            }
            else if(s.charAt(i)==' ' && count==0){
                continue;
            }
            else{
                return count;
            }

        }
        return count;


    }
}
