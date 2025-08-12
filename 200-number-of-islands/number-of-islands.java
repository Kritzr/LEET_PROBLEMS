class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length ==0){
            return 0;
        }

        int row = grid.length ; 
        int column = grid[0].length; 

        int islands = 0; 
        for(int r=0; r<row;r++){
            for(int c = 0; c<column; c++){
                if (grid[r][c] == '1'){
                    dfs(grid, r,c);
                    islands++;
                }
            }
        }
        return islands;

    }

    public void dfs(char[][] grid, int r, int c){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0'){
            return ;
        }

        grid[r][c] = '0';
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0, -1}};

        for(int[] dir: directions){
            dfs(grid, dir[0]+r, dir[1]+c);
        }
    }
}