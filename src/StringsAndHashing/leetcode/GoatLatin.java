package StringsAndHashing.leetcode;
//Q: https://leetcode.com/problems/goat-latin/description/
public class GoatLatin {
    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        System.out.println(toGoatLatin(s));
    }

    public static String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i=0;i<words.length;i++){
            StringBuilder word = new StringBuilder(words[i]);
            if(isVowel(word.charAt(0))==true){
                word.append("ma");
            }
            else{
                char c = word.charAt(0);
                word.deleteCharAt(0);
                word.append(c).append("ma");
            }
            word.append(String.valueOf('a').repeat(i+1));

            if(i==words.length-1){
                result.append(word);
            }
            else{
                result.append(word).append(" ");
            }


        }
        return result.toString();


    }

    public static boolean isVowel(char c){
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e'
                || c=='i' || c=='o' || c=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}
