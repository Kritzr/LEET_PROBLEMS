class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int res[] = {-1, -1};
        int start = 0, end = nums.length - 1;

        while(start <= end)
        {

            int mid = start + (end - start)/2;

            if(target == nums[mid])
            {
                int k = mid-1;
                while(k >= 0 && nums[k] == target)
                {
                    k--;
                }
                res[0] = k+1;
                while(mid < nums.length && nums[mid] == target)
                {
                    mid++;
                }
                res[1] = mid - 1;
                break;
            }

            if(nums[mid] > nums[end])
            {
                if(target > nums[mid])
                {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > nums[mid])
                {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }


        return res;
    }
}