package Practice;

import java.util.Arrays;

public class Bbs {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2,0,10,-20,-1};
        bs(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bs(int[] array){
        for(int i=1;i<array.length;i++){
            boolean swap=false;
            for(int j=0;j<array.length-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap=true;
                }

            }
            if(!swap){
                break;
            }
        }

    }
}
