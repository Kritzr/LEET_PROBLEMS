class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<(n-1))
            return -1;

        int[] parents = new int[n];
        for(int i =0; i<n; ++i){
            parents[i] = i;
        }
        int components = n;
        for(int[] connect : connections){
            int x = find(parents, connect[0]);
            int y = find(parents, connect[1]);
            if(x!=y){
                parents[x] = y;
                components--;
            }
        }
         
        
        
        return components -1;
    }

    public int find(int[] parents, int x){
        if(parents[x]!=x){
            parents[x] = find(parents, parents[x]);

        }
        return parents[x];
    }
}