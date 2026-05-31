class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)
            return 0;
        int n = nums.length;
        int cnt = 0;
        int prod = 1;

        for (int l = 0, r = 0; r < n; r++) {

            prod = prod * nums[r];
            while (prod >= k) {
                prod /= nums[l++];

            }
            cnt += r - l + 1;
        }

        return cnt;
    }
}