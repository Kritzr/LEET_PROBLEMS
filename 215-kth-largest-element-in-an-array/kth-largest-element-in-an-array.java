class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length; 
        System.out.println(nums[k-1] + " "+ nums[n-k]);
        return nums[n-k]; 
    }
}