class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        dfs(rooms, vis, 0);

        for(boolean visited : vis){
            if(!visited){
                return false;
            }
        }
        return true;
    }

    void dfs(List<List<Integer>> rooms, boolean[] vis, int roomNo) {
        vis[roomNo] = true;
        for (int key : rooms.get(roomNo)) {
            if (!vis[key]) {
                dfs(rooms, vis, key);
            }
        }
        
    }
}