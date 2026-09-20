package Recursion.practice;

import java.util.Arrays;

//Sort an array in ascending order using merge sort.
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        mergeSort2(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //METHOD2; Merge sort in-place(without creating a new array)
    public static void mergeSort2(int[] arr, int start, int end){
        //base condition
        if(end-start==1){
            return;
        }
        int mid = start + (end-start)/2;

        mergeSort2(arr,start,mid);
        mergeSort2(arr,mid,end);

        merge2(arr,start,mid,end);


    }

    public static void merge2(int[] arr, int start,int mid, int end){
        int[] result = new int[end-start];
        int i=start;
        int j=mid;
        int k=0;

        while(i<mid && j<end){
            if(arr[i] < arr[j]){
                result[k]  = arr[i];
                i++;
            }
            else{
                result[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<mid){
            result[k] = arr[i];
            i++;
            k++;
        }

        while(j<end){
            result[k] = arr[j];
            j++;
            k++;
        }

        //copy the elements of array result into the main array arr
        for(int x=0; x<result.length; x++){
            arr[start+x] = result[x];
        }

    }











    //METHOD1; Merge sort by creating new arrays at every step (NOT in-place sorting)
    public static int[] mergeSort(int[] arr){
        //base condition
        if(arr.length == 1){
            return arr;
        }
        //divide the array in half by taking mid then create separate arrays left and right
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        //merge
        return merge(left,right);

    }


    //function to merge the two sorted arrays
    public static int[] merge(int[] arr1, int[] arr2){
        //new array to store the resultant merged array
        int[] result = new int[arr1.length+arr2.length];
      //pointer variables
        int i=0;  //i is pointer for arr1 elements
        int j=0;  //j is pointer for arr2 elements
        int k=0;  //k is pointer for result array elements

//while both sorted arrays have elements left, compare and add the smaller element to result
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }
            else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        //there can be cases where either one of the array pointers gets out of the array,
        //in that case the elements of the other array should be added to result
        //thus only one of the two following while loops will run

        //when i pointer gets out of arr1, add all the remaining elements in arr2 to result:
        while(j<arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }
        //when j pointer gets out of arr2, add all the remaining elements of arr1 to result:
        while(i<arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }

        return result;


    }

}
