package Strings.leetcode;

import java.util.ArrayList;
import java.util.List;

//Q: https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {
    //Brute force approach: Time Complexity O(n^2) //exceeded time limit on LC
    //For each element i in strs, check every other element j
    //if it is anagram of i.
    //isAnagram(true) -> add to list, isAnagram(false) -> continue(skip already visited elements)
    //For each i skip the element that has already been visited
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }

    public static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i=0; i<strs.length; i++){
            if(visited[i]){
                continue;
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                for(int j=i+1; j<strs.length; j++){
                    if(!visited[j] && isAnagram(strs[i],strs[j])){
                        list.add(strs[j]);
                        visited[j] = true;
                    }
                }
                result.add(list);

            }
        }
        return result;
    }

    public static boolean isAnagram(String str1, String str2){
        //count frequency of each letter in both strings using 2 fixed size(26) arrays
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char x : str1.toCharArray()){
            freq1[x - 'a']++;
        }
        for(char x : str2.toCharArray()){
            freq2[x - 'a']++;
        }

        if(str1.length()==str2.length()){
            for(int i=0; i<str1.length(); i++){
                if(freq1[str1.charAt(i) - 'a']==freq2[str1.charAt(i) - 'a']){
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
