mimport java.util.*;

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        Queue<int[]> queue = new LinkedList<>(); 
        int n = isWater.length; // Number of rows
        int m = isWater[0].length; // Number of columns
        int[][] height = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        // Initialize the queue with water cells
        for (int i = 0; i < n; ++i) { // Correctly iterate rows
            for (int j = 0; j < m; ++j) { // Correctly iterate columns
                if (isWater[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        // Directions for moving up, down, left, right
        int[] dir = {-1, 0, 1, 0}; 
        int level = 0;

        // Perform BFS
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                int[] curr = queue.poll();
                int x = curr[0];
                int y = curr[1];

                // Explore all four directions
                for (int d = 0; d < 4; ++d) {
                    int newX = x + dir[d];
                    int newY = y + dir[(d + 1) % 4]; 
                    if (isValid(newX, newY, n, m) && !visited[newX][newY]) {
                        queue.offer(new int[]{newX, newY});
                        height[newX][newY] = 1 + level;
                        visited[newX][newY] = true;
                    }
                }
            }
            level++;
        }
        return height;
    }

    // Validity check for coordinates
    private boolean isValid(int x, int y, int n, int m) {
        return (x >= 0 && x < n && y >= 0 && y < m); // Use n (rows) and m (columns) correctly
    }
}
