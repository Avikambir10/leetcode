class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int[] positive = new int[n / 2];
        int[] negative = new int[n / 2];

        int p = 0, q = 0;

        for (int num : nums) {
            if (num >= 0) positive[p++] = num;
            else negative[q++] = num;
        }

        int[] res = new int[n];
        p = 0;
        q = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) res[i] = positive[p++];
            else res[i] = negative[q++];
        }

        return res;
    }
}