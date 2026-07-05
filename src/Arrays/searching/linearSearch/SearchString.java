package Arrays.searching.linearSearch;
import java.util.*;

//Q: Find whether a character exists in a string or not, and return its position.

public class SearchString {
    public static void main(String[] args) {

        String name="Harry Potter";

        //input character to be searched
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter character to be searched in string: ");
        char target=sc.nextLine().charAt(0);

        //method call
        int index=(searchInString(name,target));

        //display result
        if(index!=-1){
            System.out.println("Character found at position "+(index+1));
        }
        else{
            System.out.println("Character not found");
        }

        sc.close();


    }

    //method for searching in a string
    public static int searchInString(String str,char ch){
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == ch){
                return i;
            }
        }
        return -1;

    }

    //mistake 1: unnecessary method calls multiple times
    //imagine if the array had a million elements — you'd be doing double the work.
    //never recompute what you can store.

    //mistake 2: used a built-in method for linear search 'indexOf()'
    //that is fine for big projects but not in the learning phase, implement the loop yourself.
    //what I did: public static int searchInString(String str,char ch){ return str.indexOf(ch);}





}
