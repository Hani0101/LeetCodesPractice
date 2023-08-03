class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, sell = 0;
        for ( int i =0; i< prices.length; i++){
            buy=Math.min(buy,prices[i]); //buy at the minimum number found in the arrray
            sell=Math.max(sell,prices[i]-buy);// sell at the maximum number found in the array
        }
        return sell;
    }
}
