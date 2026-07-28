package Strings.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Q: https://leetcode.com/problems/group-anagrams/
public class GroupAnagramsOptimize {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagramsO(strs));



    }
    public static List<List<String>> groupAnagramsO(String[] strs) {
        //Make a resultant list
        List<List<String>> result = new ArrayList<>();
        //HashMap that stores strings as key and list of strings as values
        HashMap<String,List<String>> hm = new HashMap<>();

        //For every string, make a frequency count array of fixed size(26)
        //and convert it to a string using StringBuilder and ensure there is a
        //separator (like #) between every count, then each anagram will have
        //the same string key produced.
        //Check if the key produced is existing in the hashmap, if it does => add to list
        //if it doesnt => make it a key with a new list.

        for(int i=0; i<strs.length; i++){
            int[] frequency = new int[26];
            for(char x : strs[i].toCharArray()){
                frequency[x - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int x : frequency){
                sb.append(x).append('#');
            }
            String key = sb.toString();

            if(hm.containsKey(key)){
                (hm.get(key)).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList();
                list.add(strs[i]);
                hm.put(key, list);
            }
        }

        //traverse the hashmap and add every value to resultant list
        for(Map.Entry<String,List<String>> e : hm.entrySet()){
            result.add(e.getValue());
        }
        return result;

    }
    
}
