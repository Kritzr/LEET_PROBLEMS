class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        if(n<2){
            return 0;
        }

        long topsum = 0;
        long bottomsum = 0;
        for(int val:grid[0]){
            topsum+=val;
        }

        long minsum = Long.MAX_VALUE;
        for(int i =0; i<n; i++){
            topsum-=grid[0][i];
            minsum = Math.min(minsum, Math.max(topsum, bottomsum));
            bottomsum+=grid[1][i];
        }
        return minsum;
    }
}
