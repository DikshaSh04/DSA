package StringsAndHashing.leetcode;
//Q: https://leetcode.com/problems/to-lower-case/
public class LowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(lc(s));


    }
    // logic: An uppercase and lowercase value of the same alphabet differ by 32 ASCII value.

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
