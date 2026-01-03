

class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) == n) return x;
        }
        return -1;
    }
}
