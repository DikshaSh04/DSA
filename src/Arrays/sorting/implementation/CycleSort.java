package Arrays.sorting.implementation;

import java.util.Arrays;
//if range of numbers are from 1 to n
//logic: i=value at i - 1
public class CycleSort {
    public static void main(String[] args) {
        int[] arr={2,3,1,5,10,4,6,8,7,9};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1; //save correct index for current element
            if(i!=correctIndex){
                int temp=arr[i];//swap current value at index i with value at correct index
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else {
                i++;
            }
        }
    }



//mistake: Code running but not optimal, as this solution used 2 loops
//    public static void cycleSort(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            while(i!=arr[i]-1){
//                int destinationIndex=arr[i]-1; //save the correct index of current element at i
//                int temp=arr[i];
//                arr[i]=arr[destinationIndex];
//                arr[destinationIndex]=temp;
//
//            }
//
//        }
//    }
}
