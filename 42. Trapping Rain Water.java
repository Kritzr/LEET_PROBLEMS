class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }

        int left = 0, right = height.length-1;
        int Maxl = height[left];
        int Maxr = height[right];
        int result = 0;

        while(left<right){
            if(Maxl < Maxr){
                left++;
                Maxl = Math.max(Maxl,height[left]);
                result += Maxl - height[left];
            }

            else{

                right--;
                Maxr = Math.max(Maxr, height[right]);
                result += Maxr - height[right];
            }
        }

        return result;

    }
}
