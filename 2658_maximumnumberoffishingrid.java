class Solution {
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxfish =0;
        boolean[][] visited = new boolean[m][n];
        for(int i =0;i<m;i++){
            for(int j =0; j<n;j++){
                if(!visited[i][j] && grid[i][j] >0){
                    visited[i][j] = true;
                    maxfish = Math.max(maxfish, dfs(grid, visited, m,n,i,j));
                }
            }
        }
        return maxfish;
    }
    int[] dir = {-1,0,1,0,-1};
    boolean isvalid(int x, int y, int m, int n){
        return x>=0 && x<m && y>=0 && y<n;
    }

    int dfs(int[][] grid, boolean[][] visited, int m, int n , int x, int y){
        int fishcount = grid[x][y];
        for(int i =0; i<4; i++){
            int newx = x+dir[i];
            int newy = y+dir[i+1];
            if(isvalid(newx, newy,m,n)&& !visited[newx][newy] && grid[newx][newy]>0){
                visited[newx][newy] = true;
                fishcount+=dfs(grid, visited, m,n,newx, newy);
            }
        }
        return fishcount;
    }
}
