class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i:nums){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }
        for(int j: freq.keySet()){
            if(freq.get(j)>1){
                return j;
            }
        }
        //for(int i=0; i<len; i++){
        //    if(nums[i]==nums[i+1] || nums[i]==nums[i+2]){
          //      return nums[i];
           // }
        //}
        return nums[0];
    }
}