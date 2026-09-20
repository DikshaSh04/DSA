package Recursion.practice.basic;
//print the following pattern:
//for n=4  :  ****
//            ***
//            **
//            *
public class TrianglePattern1 {
    public static void main(String[] args) {
        start2(4);

    }

    //iterative method
    public static void start1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //recursive method:
    public static void start2(int n){
        //base condition:
        if(n<1){
            return;
        }
        
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
        start2(n-1);
    }
}
