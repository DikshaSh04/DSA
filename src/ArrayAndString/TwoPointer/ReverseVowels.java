package ArrayAndString.TwoPointer;
//Q: https://leetcode.com/problems/reverse-vowels-of-a-string/description/
public class ReverseVowels {
    public static void main(String[] args) {
        String s = "yo! Bottoms Up, u.S. Motto, bOy!";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        //take two pointers at the start and end, stop when a vowel is found
        //from the start and from the end, swap them and mvove inward
        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            if(isVowel(arr[start]) && isVowel(arr[end])){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else{
                if(!isVowel(arr[start])){
                    start++;
                }
                if(!isVowel(arr[end])){
                    end--;
                }
            }

        }
        return new String(arr);

    }

    public static boolean isVowel(char c){
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u' ){
            return true;
        }
        else{
            return false;
        }
    }
}
