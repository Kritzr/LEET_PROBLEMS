class Solution {
    public int trap(int[] height) {
        if(height ==null || height.length == 0){
            return 0;
        }

        int left = 0; 
        int right =  height.length -1;
        int max_left = height[left];
        int max_right = height[right];
        int result = 0;

        while(left<right){
            if(max_left<max_right){
                left++;
                max_left = Math.max(max_left, height[left]);
                result+= max_left - height[left];

            }

            else{
                right --; 
                max_right = Math.max(max_right, height[right]);
                result+= max_right - height[right];
            }
            
        }
        return result;
    }
}