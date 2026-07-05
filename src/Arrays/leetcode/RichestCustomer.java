package Arrays.leetcode;
//algorithm used: linear search
public class RichestCustomer {
    public static void main(String[] args) {
        int[][] arr={{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(arr));

    }

    public static int maximumWealth(int[][] accounts){
        int maxWealth=0;

        for(int i=0;i<accounts.length;i++){
            int wealth=0;
            for(int j=0;j<accounts[i].length;j++){
                wealth+=accounts[i][j];
            }

            if(wealth>maxWealth){
                maxWealth=wealth;
            }

        }
        return maxWealth;



    }



//what I thought of:

//    public static int maximumWealth(int[][] accounts) {
//
//        //creating an array of wealth of each customer
//        ArrayList <Integer> wealths = new ArrayList<>();
//
//        for(int i=0;i<accounts.length;i++){
//            int wealth=0;
//            for(int j=0;j<accounts[i].length;j++){
//                wealth+=accounts[i][j];
//            }
//            wealths.add(wealth);
//        }
//
//        Optional<Integer> ans = wealths.stream().max(Comparator.naturalOrder());
//        return ans.get();
//
//    }
}
