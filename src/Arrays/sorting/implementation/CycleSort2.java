package Arrays.sorting.implementation;

import java.util.Arrays;

//if range of numbers is from 0 to n
//logic: i=value at i
public class CycleSort2 {
    public static void main(String[] args) {
        int[] arr={1,2,0,3,5,4};
        cs2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cs2(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]; //correct index of element at i
            if(i!=correctIndex){ //if current index i is not equal to correct index of element at i
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else{
                i++;
            }

        }
    }
}
