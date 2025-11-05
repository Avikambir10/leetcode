class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        for (int i = 0; i < n; i++) {
            color[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (dfs(graph, i, color, 0) == false) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean dfs(int[][] graph, int node, int[] color, int col) {
        color[node] = col;

        for (int neigh : graph[node]) {
            if (color[neigh] == -1) {
                if (dfs(graph, neigh, color, 1 - col) == false) {
                    return false;
                }
            } else if (color[neigh] == col) {
                return false;
            }
        }
        return true;
    }
}