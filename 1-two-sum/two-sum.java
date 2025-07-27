class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<>();
        for (int i =0; i<nums.length; i++){
            int n = nums[i];
            int diff = target - n;
            if(sum.containsKey(diff))
                return new int[] {sum.get(diff),i};
            
            sum.put(n,i);
        }
        return new int[] {};
    }
}