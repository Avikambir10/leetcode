class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int cnt = 0;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int isEqual = 1;

                for (int i = 0; i < n; i++) {
                    if (grid[r][i] != grid[i][c]) {
                        isEqual = 0;
                        break;
                    }
                }

                cnt += isEqual;

            }
        }
        return cnt;
    }
}