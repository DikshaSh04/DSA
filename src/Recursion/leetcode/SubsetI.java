package Recursion.leetcode;
import java.util.ArrayList;
import java.util.List;

//Q: https://leetcode.com/problems/subsets/description/
public class SubsetI {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        System.out.println(subsetRec(arr));
    }

    //ITERATIVE METHOD :
    public static List<List<Integer>> subset(int[] arr){
        //first create the final list that will store the subsets
        List<List<Integer>> result = new ArrayList<>();

        //adding an empty list to the result
        result.add(new ArrayList<>());

        //for every number in arr, make a copy of all existing lists in result, and
        //add the number to them
        for(int num : arr){
            //n is the number of lists already present in result
            int n = result.size();
            //make a copy of a list and add num to it - do this n times
            for(int i=0; i<n; i++){
                //shortcut to make copy of list:
                //pass the individual list in result in parameter
                List<Integer> innerList = new ArrayList<>(result.get(i));
                innerList.add(num);

                //add the inner list to result list
                result.add(innerList);

            }
        }
        return result;
    }

    //RECURSIVE METHOD
    public static List<List<Integer>> subsetRec(int[] arr){
        return helper(new ArrayList<>(),arr,0);
    }

    public static List<List<Integer>> helper(List<Integer> sbset,int[] original,int i){
        List<List<Integer>> ans = new ArrayList<>();
        //base condition
        if(i == original.length){
            ans.add(new ArrayList<>(sbset));
            return ans;
        }

        //take the element at current index
        sbset.add(original[i]); //step 1 take the element
        ans.addAll(helper(sbset,original,i+1)); //explore everything that INCLUDES the element

        //undo (backtrack)
        sbset.remove(sbset.size() - 1); //removes the last element(un-does step 1)
        ans.addAll(helper(sbset,original,i+1)); //explore everything that EXCLUDES the element

        return ans;
    }



}
