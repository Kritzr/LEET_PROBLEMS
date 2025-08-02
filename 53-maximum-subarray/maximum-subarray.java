class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0; 
        }
        int max = nums[0];
        int curr= 0; 
        for(int n:nums){
            curr = Math.max(curr, 0);
            curr += n;
            max = Math.max(max, curr);
        }

        return max;

    }
}