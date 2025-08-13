class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); 

        
        for (int num : nums) {
            maxHeap.offer(num);
        }

       
        while (--k > 0) {
            maxHeap.poll();
        }

        
        return maxHeap.poll(); 
    }
}