package Recursion.practice.strings;

import java.util.ArrayList;
import java.util.List;

//Q: Return a list of all permutations of a given string.
public class Permutations {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(permutation(s));

    }

    public static List<String> permutation(String s){
        return helper("",s);
    }

    //we take a processed string and unprocessed string as parameter,
    //return the processed strings whenever unprocessed is empty.
    public static List<String> helper(String p, String up){
        //first create the list to be returned
        List<String> result = new ArrayList<>();

        //base condition
        if(up.isEmpty()){
            result.add(p);
            return result;
        }
        //character to be added in current function call
        char c = up.charAt(0);

        //now we take the char c and add it to different positions of processed string.
        //with every function call, the length of processed string will be diff and
        //hence the number of positions will be diff and thus there will be variable
        //number of recursive calls at each level.

        //LOGICALLY, number of recursive calls at each level/number of positions
        // = length of processed string + 1

        for(int i=0; i<=p.length(); i++){

            String newP = p.substring(0,i)+c+p.substring(i);

            List<String> inner = helper(newP,up.substring(1));

            result.addAll(inner);

        }

        return result;

    }

}
