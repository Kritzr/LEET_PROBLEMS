class Solution {
    public int findMin(int[] nums) {
        int left = 0; 
         int right = nums.length-1;
         int result = nums[0];

         while(left<=right){
            if(nums[left] <nums[right]){
                result = Math.min(result, nums[left]);
                break;
            }

            int middle = left+(right-left)/2;
            result = Math.min(result, nums[middle]);
            if(nums[middle] >= nums[left]){
                left = middle +1;

            }

            else {
                right = middle -1;
            }
         }
         return result;
    }
}
