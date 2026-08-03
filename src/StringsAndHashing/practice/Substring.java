package StringsAndHashing.practice;
// Q: Return all substrings of given string.
public class Substring {
    public static void main(String[] args) {
        String s1 = "Gopi";
        substrings(s1);

    }

    public static void substrings(String str){
        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
