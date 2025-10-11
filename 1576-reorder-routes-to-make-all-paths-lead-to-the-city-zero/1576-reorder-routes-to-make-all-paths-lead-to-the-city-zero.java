class Solution {
    int cnt = 0;

    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        HashSet<String> set = new HashSet<>(); // to store original path

        for (int[] edge : connections) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);

            set.add(u + "->" + v);
        }

        boolean[] vis = new boolean[n];

        dfs(set, adj, vis, 0);
        return cnt;
    }

    void dfs(HashSet<String> set, List<List<Integer>> adj, boolean[] vis, int curr) {
        vis[curr] = true;

        for (int neighbour : adj.get(curr)) {

            if (!vis[neighbour]) {
                
                 // If edge in original direction (current -> neighbor), it must be reversed
                if (set.contains(curr + "->" + neighbour)) {
                    cnt++;
                }
                dfs(set, adj, vis, neighbour);
            }
        }
    }
}