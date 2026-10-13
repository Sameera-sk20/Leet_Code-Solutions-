class Solution {
    public int maxProfit(int[] prices) {
     int bef=prices[0];
     int profit=Integer.MIN_VALUE;
     if(prices.length==1)
     return 0;
     for(int i=1;i<prices.length;i++)
     {
        bef=Math.min(bef,prices[i]);
        profit=Math.max(profit,Math.abs(bef-prices[i]));
     }   
     return profit;
    }
}