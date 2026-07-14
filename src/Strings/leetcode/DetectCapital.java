package Strings.leetcode;

import java.sql.SQLOutput;

//Q: https://leetcode.com/problems/detect-capital/description/
public class DetectCapital {
    public static void main(String[] args) {
        String s = "USA";
        System.out.println(detectCapitalUse(s));

    }
    public static boolean detectCapitalUse(String word) {
        char[] arr = word.toCharArray();
        int capital = 0;
        boolean firstCapital=false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>='A' && arr[i]<='Z'){
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
