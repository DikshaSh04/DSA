package Strings.leetcode;
//Q: https://leetcode.com/problems/to-lower-case/
public class LowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(lc(s));


    }

    public static String lc(String s){
        //without using built-in .toLowerCase method:
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(chars[i]>='A' && chars[i]<='Z'){
                chars[i]+=32;
            }
        }
        return new String(chars);
    }
}
