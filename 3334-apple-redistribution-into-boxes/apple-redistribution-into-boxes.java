class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        for(int i=0; i<apple.length; i++){
            sum+=apple[i];
        }

        int ans=0;
        int i=capacity.length-1;
        while(sum>0){
            sum-=capacity[i];
            i--;
            ans++;
            //ans+=1;
        }
        return ans;
    }
}