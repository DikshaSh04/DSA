package Strings.leetcode;
//Q: https://leetcode.com/problems/first-unique-character-in-a-string/description/

//This can be done either using HashMaps (see LC solution) OR
//(better way) using fixed size(26) frequency counting array as the string contains
//only lowercase alphabets
public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "lleetcode";
        System.out.println(firstUniqChar(s));

    }

    public static int firstUniqChar(String s){
        //count frequency of each letter using fixed size array
        int[] freq = new int[26];
        for(char i : s.toCharArray()){
            freq[i - 'a']++;
        }

        //iterate over the string and return the index of the letter having
        //frequency count = 1 (main logic)
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
