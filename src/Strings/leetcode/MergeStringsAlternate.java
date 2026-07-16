package Strings.leetcode;
//Q: https://leetcode.com/problems/merge-strings-alternately/description/

public class MergeStringsAlternate {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    /*
    1. Make a StringBuilder object that will store the resultant merged string.
    2. Make 2 cases: 1. if length of word1>word2 2. if length of word2>word1
    3. In both cases append word1 char first then word2 char
    4. When i exceeds the length of shorter string, append the other remaining string
    characters only.
     */

    public static String mergeAlternately(String word1, String word2){
        StringBuilder result = new StringBuilder();

        if(word1.length()>=word2.length()){
            for(int i=0; i<word1.length(); i++){
                if(i<word2.length()){
                    result.append(word1.charAt(i)).append(word2.charAt(i));
                }
                else{
                    result.append(word1.charAt(i));
                }

            }

        }
        else{
            for(int i=0; i<word2.length(); i++){
                if(i<word1.length()){
                    result.append(word1.charAt(i)).append(word2.charAt(i));
                }
                else{
                    result.append(word2.charAt(i));
                }

            }

        }
        return new String (result);
    }
}
