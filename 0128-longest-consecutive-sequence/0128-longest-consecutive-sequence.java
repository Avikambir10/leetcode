class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int maxlen = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currnum = num;
                int streak = 1;
                while (set.contains(currnum + 1)) {
                    streak++;
                    currnum++;
                }
                maxlen = Math.max(maxlen, streak);
            }
        }

        return maxlen;
    }
}