class Solution {
    public int minTrioDegree(int n, int[][] edges) {
        List<Set<Integer>> map = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            map.add(new HashSet<>());
        }
        
        for(int[] edge : edges){
            int u = edge[0] - 1;  
            int v = edge[1] - 1;  
            map.get(u).add(v);
            map.get(v).add(u);
        }
        
        int min = Integer.MAX_VALUE;
        boolean found= false;
        
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(map.get(i).contains(j) && map.get(j).contains(k) && map.get(k).contains(i)){
                        found = true;
                        
                        
                        int friend = (map.get(i).size() - 2) + 
                                         (map.get(j).size() - 2) + 
                                         (map.get(k).size() - 2);
                        
                        min = Math.min(min, friend);
                    }
                }
            }
        }
        
        return found ? min : -1;
    }
}