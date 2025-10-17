class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int cnt = 0;
        int m = maze.length;
        int n = maze[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { entrance[0], entrance[1] });

        maze[entrance[0]][entrance[1]] = '+';

        int[][] dirs = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

        while (!q.isEmpty()) {
            int size = q.size();
            cnt++;

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for (int[] dir : dirs) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    // check if going out of bounds.
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                        continue;
                    }
                    //skip cells that are already visted 
                    if (maze[nr][nc] == '+') {
                        continue;
                    }

                    if (nr == 0 ||nr == m - 1|| nc == 0 || nc == n - 1) {
                        return cnt;
                    }

                    //mark as visited.
                    maze[nr][nc] = '+';
                    q.add(new int[] { nr, nc });
                }
            }
        }
        return -1;
    }
}