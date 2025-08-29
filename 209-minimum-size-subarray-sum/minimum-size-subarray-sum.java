class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        //int right =0;
        int sum =0;
        int mini = Integer.MAX_VALUE;
        //int i =0;

        for(int right=0; right<nums.length;right++ ){
            sum+=nums[right];

            while(sum >=target){
                mini  = Math.min(mini,right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return (mini== Integer.MAX_VALUE) ? 0 : mini;

    }
}