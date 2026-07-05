package Practice;

import java.util.Arrays;

public class Ss {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2,-10,0,10,-35};
        ss(arr);
        System.out.println(Arrays.toString(arr));



    }

    public static void ss(int[] array){
        for(int i=1;i<array.length;i++){
            int maxValIndex=0;
            for(int j=1;j<=array.length-i;j++){
                if(array[j]>array[maxValIndex]){
                    maxValIndex=j;
                }
            }


            int endIndex=array.length-i;

            int temp=array[maxValIndex];
            array[maxValIndex]=array[endIndex];
            array[endIndex]=temp;
        }

    }


}
