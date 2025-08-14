class Solution {
    public int minCostConnectPoints(int[][] points) {
        //min spanning tree problem 
        //take the manhattan distance and take it as an edge?
        //prim's algo - n^2.logn??
        int n= points.length;
        int node = 0; 
        int[] distance = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(distance, 100000000);
        int edges = 0, result = 0; 

        while(edges<n-1){
            visited[node] =  true;
            int next = -1; 

            for(int i =0; i<n; i++){
                if(visited[i]){
                    continue;
                }

                int current = Math.abs(points[i][0] - points[node][0]) + Math.abs(points[i][1] - points[node][1]);
                distance[i]= Math.min(distance[i], current);
                if(next == -1 || distance[i] < distance[next]){
                    next = i;
                }
            }
            result+=distance[next];
            node = next;
            edges++;
        }
        return result;

        
    }
}