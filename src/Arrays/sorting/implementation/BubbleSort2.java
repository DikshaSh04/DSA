package Arrays.sorting.implementation;

//Q: implement bubble sort in a different way:
//instead of moving the largest element to the end,
// move the smallest element to the beginning

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] marks={56,78,34,21,99};

        bubble2(marks);
        System.out.println(Arrays.toString(marks));


    }

    public static void bubble2(int[] arr) {

        for (int p=1; p<arr.length; p++) {
            boolean swapped=false;

            for (int i = arr.length - 1; i >= p; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;

                    swapped=true;
                }
            }
            if(swapped=false){
                break;
            }
        }
    }


}
