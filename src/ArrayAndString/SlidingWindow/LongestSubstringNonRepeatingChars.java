package ArrayAndString.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

//Q: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringNonRepeatingChars {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));


    }

    //1. Make a HashSet for storing every unique character, to check for duplicates
    //2. For every character, check if it is present in the hashset
    //  a. If not -> add it in the hashset and increment end pointer
    //  b. If present -> remove the character at start pointer and check if the current
    //     char at end is still present in the hashset.
    //3. Keep updating maxLength if it is > currentLength

    public static int longestSubstring(String s){
        Set<Character> hs = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int length = 0;

        if(s.length() == 1){
            return 1;
        }
        while(end < s.length()){
            if(hs.contains(s.charAt(end))){
                length = end - start;
                hs.remove(s.charAt(start));
                start++;
            }
            else{
                hs.add(s.charAt(end));
                end++;
                if(end == s.length()){
                    length = end - start;
                }
            }

            if(length>maxLength){
                maxLength = length;
            }
        }
        return maxLength;

    }

    
}
