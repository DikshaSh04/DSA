package ArrayAndString.SlidingWindow;
//Q: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
public class MaximumVowelsInSubstring {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s,k));


    }
    //1. Count the number of vowels in the first window of K elements
    //2. Now exclude the first element from the window and include another element,
    //   a. If excluded element was vowel and new element is not -> count--
    //   b. If excluded element was not vowel and new element is -> count++
    //   c. If both neither condition satisfies -> count remains same
    //3. Update value of maxVowel everytime count > maxVowel

    public static int maxVowels(String s, int k){

       int vowelCount = 0;
       for(int i=0; i<k; i++){
           if(isVowel(s.charAt(i))) {
               vowelCount++;
           }
       }
       int maxVowel = vowelCount;


       for(int i=0; i<s.length()-k; i++){
           int j = i+k;
           if(!isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
               vowelCount++;
           }
           if(isVowel(s.charAt(i)) && !isVowel(s.charAt(j))){
               vowelCount--;
           }
           if(vowelCount > maxVowel){
               maxVowel = vowelCount;
           }
       }
       return maxVowel;

        
    }

    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}
