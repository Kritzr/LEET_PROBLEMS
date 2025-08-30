class Solution {
    public int searchInsert(int[] nums, int target) {
        return binary_search(0,nums.length-1,nums, target);
    }

    public int binary_search(int l, int r, int[] nums, int target){
        if(l>r){
            return l;
        }
        int mid = (r-l)+l/2;
        if(nums[mid]==target){
            return mid;
        }
        return (nums[mid] < target) ? 
            binary_search(mid + 1, r, nums, target) : 
            binary_search(l, mid - 1, nums, target);
    }
}