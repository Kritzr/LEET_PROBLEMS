class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
         Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : nums2) {
            map2.put(num, 1); 
        }

        Map<Integer, Integer> map1 = new HashMap<>();
        for (int num : nums1) {
            map1.put(num, 1);
        }

        int count1 = 0;
        for (int num : nums1) {
            if (map2.containsKey(num)) {
                count1++;
            }
        }

        int count2 = 0;
        
        for (int num : nums2) {
            if (map1.containsKey(num)) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }
}