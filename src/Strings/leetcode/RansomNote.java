package Strings.leetcode;
//Q: https://leetcode.com/problems/ransom-note/description/

//This problem can be done either using HashMaps (see LC solution)
//OR (better way) using a fixed frequency count array since it is mentioned in ques
//that the strings contain only lowercase(26) alphabets.
public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aaal";
        String magazine = "lalala";
        System.out.println(canConstruct(ransomNote,magazine));

    }

    public static boolean canConstruct(String ransomNote, String magazine){
        //count frequency of each letter in both strings using 2 fixed size(26) arrays
        int[] frequency1 = new int[26];
        for(char i : ransomNote.toCharArray()){
            frequency1[i - 'a']++;
        }
        int[] frequency2 = new int[26];
        for(char i : magazine.toCharArray()){
            frequency2[i - 'a']++;
        }
        //iterate string ransomNote and check if frequency of each letter is <=
        //frequency of each letter in magazine (main logic)
        for(int i=0; i<ransomNote.length(); i++){
            if(frequency1[ransomNote.charAt(i) - 'a']<=frequency2[ransomNote.charAt(i) - 'a']){
                continue;
            }
            else{
                return false;
            }
        }
        return true;


    }


}
