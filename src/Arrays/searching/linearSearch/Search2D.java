package Arrays.searching.linearSearch;
import java.util.*;
public class Search2D {
    public static void main(String[] args) {
        int[][] matrix={
                {25,35,45},
                {10,20},
                {60,70,80,90}

        };

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to be searched: ");
        int target=sc.nextInt();


        int[] result=searchIn2D(matrix,target);

        System.out.println(Arrays.toString(result));

    }

    public static int[] searchIn2D(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                if(arr[row][column]==target){
                    return new int[]{row,column};
                }
            }
        }

        return new int[]{-1,-1};


    }
}
