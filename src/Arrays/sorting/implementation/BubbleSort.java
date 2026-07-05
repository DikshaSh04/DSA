package Arrays.sorting.implementation;

//logic: move the largest element to the end of array in each pass,
//by comparing adjacent elements and swapping if they are in wrong order.

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] marks={99,34,98,54,60,21,48};


        System.out.println("Unsorted array: "+Arrays.toString(marks));
        bubble(marks);
        System.out.println("Sorted array: "+Arrays.toString(marks));

    }


    public static void bubble(int[] arr){

        for(int p = 1 ;p< arr.length; p++){
            boolean swapped=false;

            for (int i = 0; i < arr.length-p; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }

        }



    }

    //mistake 1: created another method swap() for swapping elements,
    //it is wrong because arrays are objects, what is actually passed to a
    //method is the value of the reference (the memory address) to that array.
    //so, use swap logic directly inside the bubble sort method.

    //mistake 2: visited elements that had already been sorted, no need to waste time.
    //thus, use logic in inner loop: i<arr.length-P , where P is the Pth pass

    //mistake 3: did not optimize the algorithm by not breaking the loop if
    //the array is already sorted, i.e. no swap occurred in a particular pass.
    //so, use a flag condition to check if the elements have been swapped in a pass or not.






}
