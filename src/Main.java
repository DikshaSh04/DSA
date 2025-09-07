//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Algorithm to display first 20 fibonacci numbers using recursion.

    public static int GlobalCounter=2; //Step1: Define a global counter of no. of fibonacci numbers already displayed(0 and 1).
    //Step2: Create a function.
    public static void Fibonacci(int a,int b){
        if(GlobalCounter<=19){
            int NewFibo=a+b;
            System.out.println(NewFibo);
            a=b;
            b=NewFibo;
            GlobalCounter+=1;
            Fibonacci(a,b); //Step3:Recursion
        }
        else{
            return;
        }


     }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1); //Step4: Display first 2 fibonacci numbers.
        Fibonacci(0,1);   //Step5: Call function.


        }
    }
