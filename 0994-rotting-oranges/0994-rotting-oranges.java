import java.util.*;

class Solution {

    public class pair {
        int row;
        int col;
        int time;

        public pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        Queue<pair> q = new LinkedList<>();

        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];

        int fresh = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new pair(i, j, 0));
                    vis[i][j] = true;

                }
                // fresh oranges count
                if (grid[i][j] == 1) {
                    fresh++;
                }

            }
        }

        int ans = 0;
        while (!q.isEmpty()) {
            pair curr = q.remove();
            int i = curr.row;
            int j = curr.col;
            int t = curr.time;

            ans = Math.max(ans, t);
            // bottom
            if ((i + 1) < m && !vis[i + 1][j] && grid[i + 1][j] == 1) {
                vis[i + 1][j] = true;//rotten
                fresh--;
                q.add(new pair(i + 1, j, t + 1));
            }
            // top
            if ((i - 1) >= 0 && !vis[i - 1][j] && grid[i - 1][j] == 1) {
                vis[i - 1][j] = true;
                fresh--;
                q.add(new pair(i - 1, j, t + 1));
            }
            // right
            if ((j + 1) < n && !vis[i][j + 1] && grid[i][j + 1] == 1) {
                vis[i][j + 1] = true;
                fresh--;
                q.add(new pair(i, j + 1, t + 1));
            }
            // left
            if ((j - 1) >= 0 && !vis[i][j - 1] && grid[i][j - 1] == 1) {
                vis[i][j - 1] = true;
                fresh--;
                q.add(new pair(i, j - 1, t + 1));
            }
        }
        if (fresh != 0) {
            return -1;
        }
        return ans;
    }
}