package Strings.practice;

import java.util.HashMap;
import java.util.Map;

//Q: Find the frequency of each element in an integer array
//Here we make use of HashMaps [Time complexity: O(n)]
public class FreqCountUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2,3,1};
        countFrequencyHM(arr);

    }

    public static void countFrequencyHM(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            System.out.println(e.getKey() + "->" + e.getValue());
        }
    }
}
