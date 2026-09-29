package Recursion.practice.strings;
//Q: Remove all occurrences of character 'a' from a given string and return it - use recursion.
public class SkipChar {

    public static void main(String[] args) {
        String name = "Diksha";
        System.out.println(skipChar(name));
    }

    //recursive method
    public static String skipChar(String str){
        StringBuilder sb = new StringBuilder();
        return helper(str,sb,0);
    }

    public static String helper(String str,StringBuilder sb, int i){
        //base condition
        if(i >= str.length()){
            return sb.toString();
        }
        if(str.charAt(i) != 'a'){
            sb.append(str.charAt(i));
        }
        return helper(str,sb,i+1);
    }

    //iterative method
    public static String removeA(String str){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c != 'a'){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
