package Arrays.sorting.questions;

//Q:  You are given an array of student scores (integers).
// Sort them in ascending order and return the sorted array.
// However, there's a twist: If two students have the same score,
// the one who appeared earlier in the original array should remain
// earlier in the sorted output (i.e., maintain their relative order).

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] scores={64, 34, 25, 12, 34, 22, 11, 25};
        sortScores(scores);

        System.out.println(Arrays.toString(scores));

    }

    public static void sortScores(int[] arr){

        for(int i=1;i<arr.length;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }

            }

            if(swapped==false){
                break;

            }



        }

    }

    //Takeaway: Equal elements are never swapped, this is why bubble sort is a
    //stable sorting algorithm.

}
