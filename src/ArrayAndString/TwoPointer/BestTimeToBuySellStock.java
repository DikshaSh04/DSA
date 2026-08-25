package ArrayAndString.TwoPointer;
//Q: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        //take two pointers CP (cost price) and SP(selling price)
        //start with CP=0 and SP=CP+1
        //IF SP<CP at any point, make CP=SP and SP=CP+1 because
        // we have to buy the stock when it costs the least
        //IF SP>CP, calculate currentProfit and check if
        // currentProfit>maxProfit then update maxProfit

        int maxProfit = 0;
        int currentProfit = 0;
        int CP=0;
        int SP=1;

        while(SP<prices.length){
            if(prices[CP] > prices[SP]){
                CP = SP;
                SP = CP+1;
            }
            else{
                currentProfit = prices[SP] - prices[CP];
                SP++;

                if(currentProfit>maxProfit){
                    maxProfit = currentProfit;
                }
            }
        }

        if(maxProfit>0){
            return maxProfit;
        }
        else{
            return 0;
        }



    }
}
