import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);


            }else{
                // first day  buy the stock and then check that buyPrice<prices[i] if true then calculate profit and maxProfit 
                buyPrice=prices[i];

            }
        }
        return maxProfit;
    }
}