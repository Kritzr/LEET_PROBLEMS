import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new List[numCourses];
        int[] degree = new int[numCourses];
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] pair : prerequisites) {
            int c = pair[0];
            int p = pair[1];
            adj[p].add(c);
            degree[c]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) {
                q.offer(i);
            }
        }
        
        while (!q.isEmpty()) {
            int current = q.poll(); 
            result.add(current);
            
            for (int n : adj[current]) {
                degree[n]--;
                if (degree[n] == 0) {
                    q.offer(n);
                }
            }
        }
        
        return result.size() == numCourses;
    }
}
