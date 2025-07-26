class Solution {
    /*public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        for(int i =0; i<nums1.length; i++){
            int j = binarysearch(nums2, i, nums1[i]);
            if(j!=-1){
                max = Math.max(j-i, max);
            }
        }
        return max;
    }
    public int binarysearch(int[] nums2, int i, int target){
        int left = i;
        int right = nums2.length - 1;
        int answer = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums2[mid] < target){
                right = mid-1;
            }
            else if(nums2[mid] >= target){
                answer = mid;
                left = mid+1;
            }
        }
        return answer;
    }*/

    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        int i = 0;
        int j = 0; 
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] > nums2[j]){
                i++;
            }
            else{
                max = Math.max(max, j++ -i);
            }
        }
        return max;
    }
}