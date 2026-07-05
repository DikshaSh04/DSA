package Practice;

import java.util.Arrays;

public class Ins {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2,10,0,-7,-10};
        in(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void in(int[] array){
        for(int i=1;i<array.length;i++){
            int key=array[i];
            for(int j=i-1;j>=0;j--){
                if(array[j]>key){
                    array[j+1]=array[j];
                }

                else{
                    break;
                }
                array[j]=key;
            }
        }

    }
}
