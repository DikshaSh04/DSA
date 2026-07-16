package Strings.leetcode;

import java.sql.SQLOutput;

//Q: https://leetcode.com/problems/detect-capital/description/
public class DetectCapital {
    public static void main(String[] args) {
        String s = "USA";
        System.out.println(detectCapitalUse(s));

    }
    /*
    1. Create a counter to count how many capitals there are in the word.
    2. Capital is found using condition: if (c>='A' && c<='Z')
    3. Now give output as per the 3 conditions given in the ques.
     */


    public static boolean detectCapitalUse(String word) {
        int capital = 0;
        boolean firstCapital=false;

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(c>='A' && c<='Z'){
                capital+=1;
                if(i==0){
                    firstCapital = true;
                }
            }

        }

        if(capital==word.length() || capital==0){
            return true;
        }
        else if(capital==1 && firstCapital){
            return true;
        }
        else{
            return false;
        }
    }
}
