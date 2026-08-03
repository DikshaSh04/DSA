package StringsAndHashing.leetcode;

import java.util.HashMap;

// Q: https://leetcode.com/problems/isomorphic-strings/description/
public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        String s1 = "badc";
        String s2 = "baba";
        System.out.println(isIsomorphic(s,t));
        System.out.println(isIsomorphic(s1,s2));
    }

    //We have to check if every character in s maps to the same character from t
    //AND vice versa i.e. every character in t maps to the same character from s

    //1.Create 2 hashmaps.
    //2.Check for each character in s, add it as a key in the map, and map it to the
    //corresponding character in t.
    //3.If the character is repeated in s, check if the value of the key maps to
    //the corresponding character in t, if it doesnt then string is not isomorphic, return false.
    //4. Repeat the same for string t.

    public static boolean isIsomorphic(String s, String t){
        HashMap<Character,Character> hm1 = new HashMap<>();
        HashMap<Character,Character> hm2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(hm1.containsKey(s.charAt(i))){
                if(hm1.get(s.charAt(i)) == t.charAt(i)){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                hm1.put(s.charAt(i),t.charAt(i));
            }
        }

        for(int i=0; i<t.length(); i++){
            if(hm2.containsKey(t.charAt(i))){
                if(hm2.get(t.charAt(i)) == s.charAt(i)){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                hm2.put(t.charAt(i),s.charAt(i));
            }
        }

        return true;

    }
}
