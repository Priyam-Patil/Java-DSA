// cycle ditection in directed graph
class Solution {

    public boolean isCycle(int src, boolean[] vis, boolean[] stack, int[][] prerequisites) {
        vis[src] = true;
        stack[src] = true;

        for (int i = 0; i < prerequisites.length; i++) {

            int v = prerequisites[i][0];
            int u = prerequisites[i][1];

            if (u == src) {

                if (stack[v]) {
                    return true;
                }

                if (!vis[v]) {
                    if (isCycle(v, vis, stack, prerequisites)) {
                        return true;
                    }
                }

            }
        }
         
        stack[src]=false;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] vis = new boolean[numCourses];
        boolean[] stack = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (isCycle(i, vis, stack, prerequisites)) {
                    // cycle exists
                    return false;
                }
            }
        }
        return true;

    }
}