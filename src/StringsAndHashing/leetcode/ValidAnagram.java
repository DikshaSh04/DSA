package StringsAndHashing.leetcode;
//Q: https://leetcode.com/problems/valid-anagram/

//can be done either using HashMaps for frequency counting
//OR (better way) using frequency count array of size 26 as the ques mentions
//the strings only contain lowercase alphabets
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));

    }

    public static boolean isAnagram(String s, String t){
        //count frequency of both strings
        //if they are of equal length and for every character they have equal
        //frequency then it is anagram

        //initializing a frequency count array since there are only lowercase(26) letters
        int[] frequency1 = new int[26];
        for(char i : s.toCharArray()){
            //incrementing the value of index at which we
            //mentally assign a letter i.e 0='a', 1='b' ... 26='z'
            frequency1[i - 'a']++;
        }
        //another frequency count array for string t
        int[] frequency2 = new int[26];
        for(char i : t.toCharArray()){
            frequency2[i - 'a']++;
        }
        //check if two strings are equal+have same frequency count for each char -> anagram
        if(s.length()==t.length()){
            for(int i=0; i<s.length(); i++){
                if(frequency1[s.charAt(i)-'a'] == frequency2[s.charAt(i)-'a']){
                    continue;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }

    }
}
