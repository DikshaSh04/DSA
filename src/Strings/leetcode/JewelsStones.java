package Strings.leetcode;
//Q: https://leetcode.com/problems/jewels-and-stones/description/
public class JewelsStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    /*
    1. Make a counter for counting jewels
    2. Convert both strings to char arrays
    3. Make nested loop -> for each JEWEL, traverse the stones array and check if
    a stone matches the current JEWEL.
    4. If matched, count++, if not matched move to next jewel and repeat.
     */

    public static int numJewelsInStones(String jewels, String stones){
        int jewelCount = 0;
        for(int i=0; i<stones.length(); i++){
            for(int j=0; j<jewels.length(); j++){
                if(stones.charAt(i)==jewels.charAt(j)){
                    jewelCount+=1;
                }
            }
        }
        return jewelCount;
    }

}
