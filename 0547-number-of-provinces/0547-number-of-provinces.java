class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                cnt++;
                dfs(isConnected, vis, i);
            }
        }
        return cnt;
    }

    void dfs(int[][] graph, boolean[] vis, int i) {
        vis[i] = true;
        for (int j = 0; j < graph.length; j++) {
            if (graph[i][j] == 1 && !vis[j]) {
                dfs(graph, vis, j);
            }
        }
    }

}