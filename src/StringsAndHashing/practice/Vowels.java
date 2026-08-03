package StringsAndHashing.practice;
// Q: Count the number of vowels in a given string.
public class Vowels {
    public static void main(String[] args) {
        String s1 = "HEllo World";
        System.out.println(countVowel(s1));

    }

    public static int countVowel(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
                count+=1;
            }
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch =='U'){
                count+=1;
            }
        }
        return count;
    }
}
