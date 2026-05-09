class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int ans = 0;
        int ans2 = 0;
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(m.containsKey(diff)){
                ans = i;
                ans2=m.get(diff);
            }else{
                m.put(nums[i],i);
            }
        }
    return new int[]{ans2,ans};
    }
}
