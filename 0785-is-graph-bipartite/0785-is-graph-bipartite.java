
// bfs and coloring approach used for to check bipatite graph
// -1  no color
// 0   yellow color
// 1   red color
import java.util.*;

class Solution {
    public boolean isBipartite(int[][] graph) {
        // coloring approach used
        int color[] = new int[graph.length];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;//no color
        }

        // bfs
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0;//yellow color

                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].length; j++) {
                        int neighbor = graph[curr][j];

                        // case1 -- nei has no color
                        if (color[neighbor] == -1) {
                            int nextcolor = (color[curr] == 0 ? 1 : 0);
                            color[neighbor] = nextcolor;
                            q.add(neighbor);

                            // case2  -- nei has same color as its parent
                        } else if (color[neighbor] == color[curr]) {
                            return false;
                        }

                    }
                }

            }
        }
        return true;
    }
}