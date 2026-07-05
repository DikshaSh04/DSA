package Arrays.searching.linearSearch;
import java.util.*;

//Q: Find out whether a number exists in an array or not, and return its position.

public class LinearSearch {

    //logic: traverse array from start to end,
    //if element matches target, return the index, else return -1.

    public static void main(String[] args) {

        //taking a random integer array nums
        int[] nums={5,13,65,48,22,95};

        //input value to be searched
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter value to be searched: ");
          int n=sc.nextInt();

          //method call
          int result=linearsearch(nums,n);

          //display result
          if(result!=-1){
            System.out.println("Element found at position " + (result + 1));
        }
          else{
              System.out.println("Element not found!");
        }

        sc.close();


        }

    //method for linear search
    public static int linearsearch(int[] arr,int toSearch){
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == toSearch) {
                return i;
            }
        }
        return -1; // convention: -1 means "not found"

            }

    //mistake 3: no need to use this logic, just use return statement to exit the method.
    // else if(i==arr.length-1){
    // System.out.println("Element not found!");}

    //mistake 1: NEVER use print statements inside methods, methods have to 'return'
    //mistake 2: used break statement to exit the loop instead of return statement.


        }




