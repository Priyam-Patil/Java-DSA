class Solution {
    public int maxProfit(int[] prices) {
        int Buyprice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(Buyprice<prices[i]){//here first we compare day1 price with higher value because on day1 first buy stock
                int profit=prices[i]-Buyprice;
                maxProfit=Math.max(maxProfit,profit);

            }else{
                Buyprice=prices[i];//for day1 Buyprice=7
            }
        }
        return maxProfit;
    }
}