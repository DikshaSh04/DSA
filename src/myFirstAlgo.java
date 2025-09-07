public class myFirstAlgo {
    //This is a program to define an algorithm to print the first 20 fibonacci numbers using loop and recursion.
    //This allows us to understand how an algorithm helps to solve a problem and it can be implemented in different ways.
    public static void main(String[] args) {

        //Algorithm to display first 20 fibonacci numbers using 'for' loop.

        int a = 0;
        int b = 1; //Step1: Initialize the first two fibonacci numbers.
        System.out.println(a);
        System.out.println(b); //Step2: Display the first two fibonacci numbers.

        for (int i = 0; i < 18; i++) {//Step3: Create a loop that runs 18 times.
            int NewFibo = a + b; //Step4: Create a new variable for the next fibonacci number.

            System.out.println(NewFibo); //Step5: Display the new fibonacci number.
            a = b;
            b = NewFibo; //Step6: Update the variables that hold the previous two fibonacci numbers.









        }
    }
}
