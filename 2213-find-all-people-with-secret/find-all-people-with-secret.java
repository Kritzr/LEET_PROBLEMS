class Solution {
    public Set<Integer> secrets, visited;
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        secrets = new HashSet<>();
        visited = new HashSet<>();
        secrets.add(0); //secrets start from him 
        secrets.add(firstPerson);
        Map<Integer, Map<Integer, List<Integer>>> people_map = new HashMap<>();

        for(int[] meeting: meetings){
            int source = meeting[0];
            int destination = meeting[1];
            int time = meeting[2];
            people_map.putIfAbsent(time, new HashMap<>());
            people_map.get(time).putIfAbsent(source, new ArrayList<>());
            people_map.get(time).putIfAbsent(destination, new ArrayList<>());
            people_map.get(time).get(source).add(destination);
            people_map.get(time).get(destination).add(source);
        }

        List<Integer> timekeys = new ArrayList<>(people_map.keySet());
        Collections.sort(timekeys);
        for(int t:timekeys ){
            visited = new HashSet<>();
            for(int source : people_map.get(t).keySet()){
                if(secrets.contains(source)){
                    dfs(source, people_map.get(t));
                }
            }
        }
        return new ArrayList<>(secrets);

    }

    public void dfs(int src, Map<Integer, List<Integer>> adj){
        if(!visited.add(src)){
            return;
        }
        secrets.add(src);
        for(int neighbours: adj.getOrDefault(src, new ArrayList<>())){
            dfs(neighbours, adj);
        }
    }
}