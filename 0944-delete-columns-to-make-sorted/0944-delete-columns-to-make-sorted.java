class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt = 0;
        int cols = strs[0].length();

        for (int i = 0; i < cols; i++) {
            if (check(strs, i) == false) {
                cnt++;
            }
        }
        return cnt;
    }

    boolean check(String[] strs, int col) {
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i].charAt(col) > strs[i + 1].charAt(col)) {
                return false;
            }
        }
        return true;
    }
}
