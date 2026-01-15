import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        //declaration and initialization of array
        String[] fruits=new String[4];

        //input array elements using for loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter fruits:");
        for(int i=0;i<fruits.length;i++){
            fruits[i]=sc.nextLine();

        }

        //iteration using for loop
        for(int j=0;j<fruits.length;j++){
           System.out.print(fruits[j]+" ");
        }

        //iteration using for-each loop
        for(String a:fruits){
            System.out.print(a+" ");
        }

        //iteration using toString method
        System.out.println(Arrays.toString(fruits));



    }
}
