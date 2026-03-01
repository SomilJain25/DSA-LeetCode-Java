//Problem: Best Time to Buy and Sell Stock
//Link:
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//Easy Level
//Approach : We know that we have to buy in less amount and sold in high amount.so i calculate min and max value.
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buy=prices[0];
        for(int j=1; j<=prices.length-1; j++){
           buy=Math.min(buy,prices[j]);
           if(prices[j]>buy){
           maxprofit=Math.max(maxprofit,prices[j]-buy);
           }
           
        } 
        return maxprofit;     
}
}
