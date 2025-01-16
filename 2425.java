class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int result = 0;

        // If nums2 has an odd length, each element in nums1 contributes to the result
        if (nums2.length % 2 == 1) {
            for (int num : nums1) {
                result ^= num;
            }
        }

        // If nums1 has an odd length, each element in nums2 contributes to the result
        if (nums1.length % 2 == 1) {
            for (int num : nums2) {
                result ^= num;
            }
        }

        return result;
    }
}
