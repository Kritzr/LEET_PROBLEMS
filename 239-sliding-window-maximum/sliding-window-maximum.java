class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n-k+1];
        Deque<Integer> queue = new LinkedList<>();

        int left =0,right =0;
        while(right<n){
            while(!queue.isEmpty() && nums[queue.getLast()]<nums[right]){
                queue.removeLast();
            }
            queue.addLast(right);
            if(left>queue.getFirst()){
                queue.removeFirst();
            }

            if((right+1)>=k){
                output[left] = nums[queue.getFirst()];
                left ++;
            }
            right++;
        }
        return output;
    }
}