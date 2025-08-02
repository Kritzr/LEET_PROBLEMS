class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length ==0){
            return 0;
        }

        int max = nums[0];
        int min = nums[0];
        int total = 0 ; 
        int currmax = 0 ; 
        int currmin = 0 ; 
        for(int n : nums){
            currmax = Math.max(currmax+n , n);
            currmin = Math.min(currmin+n, n);
            total+=n;
            max = Math.max(max, currmax);
            min = Math.min(min, currmin);

        }

        return max > 0 ? Math.max(max, total-min) : max;

    }
}