class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right = 1;
        int maxP = 0;
        int n = prices.length;
        while(left<n-1 && right<=n-1){
            if(prices[left]<=prices[right]){
                maxP = Math.max(maxP,prices[right]-prices[left]);
                right++;
            }else{
                left++;
                right = left+1;
            }
        } 
        return maxP;
    }
}
