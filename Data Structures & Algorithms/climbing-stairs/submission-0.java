class Solution {
    public int climbStairs(int n) {
        int[] cache = new int[n];

        

        return dp(n,cache);

    }
    public int dp(int n,int[] cache){
        if(n<=2){
            return n;
        }

        if(cache[n-1]!=0){
            return cache[n-1];
        }

        cache[n-1] = dp(n-1,cache)+dp(n-2,cache);
        return cache[n-1];
    }
}
