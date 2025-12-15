class Solution {
    int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        int count = 0;
        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
                if (Math.random() < 1.0 / count) {
                    ans = i;
                }
            }
        }
        return ans;
    }
}
