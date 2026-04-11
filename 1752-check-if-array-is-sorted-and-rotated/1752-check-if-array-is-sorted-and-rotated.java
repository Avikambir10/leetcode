class Solution {
    public boolean check(int[] nums) {
        int breakpoint = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                breakpoint++;
            }
        }

        if (breakpoint == 1 && nums[0] >= nums[nums.length - 1]) {
            return true;
        } else if (breakpoint == 0) {
            return true;
        } else {
            return false;
        }
    }
}