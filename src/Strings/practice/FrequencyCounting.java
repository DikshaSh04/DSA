package Strings.practice;
//Q: We have to find the frequency of each number in an integer array.
//First we try the BRUTE FORCE approach: Time Complexity [O(n^2)]

import java.util.Arrays;

public class FrequencyCounting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2,3,1};
        System.out.println(Arrays.toString(countFrequency(arr)));


    }

    public static int[] countFrequency(int[] arr){
        int[] result = new int[arr.length];        //array to store frequency of each element
        int count = 1;
        boolean[] visited = new boolean[arr.length];   //boolean flag to mark elements that have been
                                                       //visited already and not to be count again

        for(int i = 0; i<arr.length; i++){
            if(visited[i]){
                continue;
            } //if the element is already visited, skip this iteration and i++

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && !visited[j]){
                    count+=1;
                    visited[j]=true;
                }
            }
            result[i]=count;
            count = 1;

        }
        return result;
    }
}
