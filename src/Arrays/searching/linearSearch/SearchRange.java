package Arrays.searching.linearSearch;

//Q: Find whether a number exists in a certain range of an array, and return its position.

import java.util.*;

public class SearchRange {
    public static void main(String[] args) {
        int[] marks={30,68,89,23,54,78,99};

        //input start,end values and element to be searched
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start index of range: ");
        int s = sc.nextInt();
        System.out.print("Enter end index of range: ");
        int e = sc.nextInt();
        System.out.print("Enter element to be searched in given range: ");
        int t = sc.nextInt();

        //store method call
        int index=searchInRange(marks,s,e,t);

        //display result
        if(index == -2){
            System.out.println("Invalid range!");
        }
        else if(index!=-1){
            System.out.println("Element found at position "+(index+1)+" of array.");
        }
        else{
            System.out.println("Element not found!");
        }

        sc.close();

    }

    //method
    public static int searchInRange(int[] arr,int start,int end,int target){

        if(start<0 || end>=arr.length || start>end){
            return -2;
        }

        for(int i=start;i<=end;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;

    }

    //mistake: did not validate the range input.
    //what if the user entered a range which is out of bounds of array?
    //therefore always add boundary conditions/input validations

}
