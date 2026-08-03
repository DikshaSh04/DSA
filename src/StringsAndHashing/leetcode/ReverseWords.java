package StringsAndHashing.leetcode;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));


    }

    //Standard approach: Does everything on a single char array,
    //no need for multiple object allocations.
    //1. Make a char array of the original string
    //2. Identify the start and end of a word using two pointers
    //3. Reverse the characters in-place (using two pointers)

    public static String reverseWords(String s){
        char[] chars = s.toCharArray();
        int start = 0;
        for(int i=0; i<=chars.length;i++){
            if(i==chars.length || chars[i]==' ' ){
                int end = i-1;
                reverse(chars,start,end);

                start=i+1;
            }
        }
        return new String(chars);
    }

    public static void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }






    // APPROACH I THOUGHT OF: (it isnt brute force, infact it has the same time & space
    // complexity as the standard approach. BUT:
    //it is inefficient as it makes multiple object allocations,
    // assigns a new StringBuilder object for every word.

//    public static String reverseWords(String s){
//        String[] words = s.split(" ");
//        StringBuilder result = new StringBuilder();
//        for(int i = 0; i<words.length; i++){
//            StringBuilder sb = new StringBuilder(words[i]);
//            sb.reverse();
//
//            result.append(sb).append(" ");
//
//        }
//        return result.toString();
//
//    }


}
