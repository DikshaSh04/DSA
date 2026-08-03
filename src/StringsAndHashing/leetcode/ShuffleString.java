package StringsAndHashing.leetcode;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(shuffle(s,indices));

    }

    //Optimal approach : [Time complexity : O(n)]

    //make a character array that will store the characters of resultant shuffled string
    //apply logic given in question, return char array as a String using 'new String(array)'

    public static String shuffle(String s, int[] indices){
        char[] result = new char[s.length()];

        for(int i=0; i<s.length(); i++){
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }



}

//BRUTE FORCE APPROACH I thought of: [Time complexity : O(n^2)]
// First linear search the index of 0,1,2... targets in the given array
//then append the characters on the searched index in the new StringBuilder object.

//    public static String shuffle(String s, int[] indices){
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<s.length(); i++){
//            int charIndex = search(indices,i);
//
//            sb.append(s.charAt(charIndex));
//
//        }
//
//        return sb.toString();
//    }
//
//    public static int search(int[] indices,int target){
//        for(int i=0; i<indices.length; i++){
//            if(indices[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }