class Solution {
    public int trap(int[] height) {
        int maxl = 0;
        int maxr = 0;
        int l=0;
        int r = height.length-1;
        int ans = 0;
        while(l<r){
            
            if(height[l]<=height[r]){
                maxl=Math.max(maxl,height[l]);
                ans += maxl-height[l];
                l++;
            }else{
                maxr=Math.max(maxr,height[r]);
                ans+= maxr-height[r];
                r--;
            }
        }
        return ans;
    }
}
