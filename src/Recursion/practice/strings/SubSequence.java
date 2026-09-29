package Recursion.practice.strings;

import java.util.ArrayList;

//Q: Return an ArrayList of all subsequences of a given string.

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(subSeq("abc"));

    }

    //LOGIC: USE THE SUBSET METHOD - Take some characters, leave some characters
    //Here, for every character in the original string, we either take the character
    //in the new string (left sub tree) or ignore that character (right sub tree).
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


}
