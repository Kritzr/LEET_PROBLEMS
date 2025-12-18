class Solution {
    private int MOD = 1000000007;
    private int[][] dp;
    public int numberOfWays(String corridor) {
        int n = corridor.length();
        dp = new int[n][3];//seats can be 0 or 1 or 2
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        
        return dfs(0,0,corridor);
    }
        
    public int dfs(int i, int seats, String corridor){
        int res =0;
        if(i==corridor.length()){
            if(seats ==2){
                return 1;
            }
            else{
                return 0;
            }
        }

        if(dp[i][seats]!=-1){
            return dp[i][seats];
        }

        if(seats==2){
            if(corridor.charAt(i)=='S'){
                res = dfs(i+1, 1,corridor);
            }
            else{
                res = (dfs(i+1,0,corridor) + dfs(i+1, 2,corridor))%MOD;
            }
        }
        else {
            if(corridor.charAt(i)=='S'){
                res = dfs(i+1, seats+1,corridor);
            }
            else{
                res = dfs(i+1, seats, corridor);
            }
        }
        return dp[i][seats]=res;
    }
}