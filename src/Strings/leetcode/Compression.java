package Strings.leetcode;
//Q: https://leetcode.com/problems/string-compression/description/

public class Compression {
    public static void main(String[] args) {
        char[] c = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(c));

    }
    /*
    1. (The ques asked to begin with an empty string 's' which we will have to append
       required characters into) -> create a StringBuilder object 's'.
    2. (We will require a counter variable that counts the occurrence of a selected
        character, the selected character is itself 1 occurrence so set it to 1)
        -> create variable count = 1
    3. (We need two pointers that start adjacent to each other and one moves forward
        till there is a difference in characters, increment count by 1 each time the
        characters at the two pointers is same)
    4. If characters are different, append the object s as stated in the question.
    5. increment the start pointer by +count to skip the occurrences of old start character.
       Also set end to adjacent of start i.e. end=start+1, and set count =1 as it counting
       a new character now.
    6. The loop will run for every character group except the last one, so write the
       append condition again for the last group.
    7. (Lastly the ques asks to modify the input array instead of returning
       the new string) -> make a char array of the new string then replace indexes of
       old input array with indexes of new char array and return the length.

     */


    public static int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int count = 1;

        int start = 0;
        int end = 1;

        while(end<chars.length){
            if(chars[start]==chars[end]){
                count+=1;
                end++;
            }
            else{
                if(count==1){
                    s.append(chars[start]);
                }
                else{
                    s.append(chars[start]).append(count);
                }
                start+=count;
                end=start+1;
                count = 1;
            }
        }
        if(count==1){
            s.append(chars[start]);
        }
        else{
            s.append(chars[start]).append(count);
        }

        char[] result = s.toString().toCharArray();

        for(int i=0; i<result.length; i++){
            chars[i] = result[i];
        }

        return result.length;






    }
}
