class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> Nums = new HashSet<>();
        for (int num: nums){
            Nums.add(num);
        }

        int longest = 0;

        for(int num:Nums){
            if(!Nums.contains(num-1)){
                int length =1;
                while(Nums.contains(num+length)){
                    length++;

                }

                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
