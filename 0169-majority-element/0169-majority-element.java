class Solution {
    public int majorityElement(int[] nums) {
        int cand = nums[0];
        int cnt = 1;

        for (int i = 1; i < nums.length; i++) {
            if (cnt == 0) {
                cand = nums[i];
           }
            if (nums[i] == cand) {
                cnt++;
            } else {
                cnt--;
            }

        }
        return cand;
    }
}