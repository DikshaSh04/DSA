package Recursion.practice.strings;

import java.util.ArrayList;
import java.util.List;

//Q: Return an ArrayList of all subsequences of a given string.

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(subSeq("abc"));

    }

    //LOGIC: USE THE SUBSET METHOD - Take some characters, leave some characters
    //Here, for every character in the original string, we either take the character
    //in the new string (left sub tree) or ignore that character (right sub tree).


    //METHOD 1: TAKE ARRAYLIST IN THE ARGUMENT (EASY METHOD)
    public static ArrayList<String> subSeq(String original){
        ArrayList<String> list = new ArrayList<String>();
        helper(original,"",list);
        return list;
    }

    public static void helper(String original, String str, ArrayList<String> list){
        //base condition
        if(original.isEmpty()){
            list.add(str);
        }
        else{
            //we take first character from each new substring
            char ch = original.charAt(0);
            //left sub tree call - take the character in the new string
            helper(original.substring(1),str+ch,list);
            //right sub tree call - ignore the character in the new string
            helper(original.substring(1),str,list);
        }
    }

    //METHOD 2: TAKE ARRAYLIST INSIDE THE BODY OF EVERY CALL AND STORE A LOCAL ANS
    //IN EVERY CALL AND PASS IT TO ABOVE CALLS (using addAll() )
    public static List<String> subset(String str){
        String p = "";
        return helper(p,str);
    }

    public static List<String> helper(String p, String up){
        List<String> result = new ArrayList<>();
        //base condition
        if(up.isEmpty()){
            result.add(p);
            return result;
        }
        char currentChar = up.charAt(0);
        //function calls (either take the char or leave the char)
        //left funtion call - take the char
        List<String> left = helper(p+currentChar,up.substring(1));

        //right function call - ignore the char
        List<String> right = helper(p,up.substring(1));

        result.addAll(left);
        result.addAll(right);

        return result;

    }

}
