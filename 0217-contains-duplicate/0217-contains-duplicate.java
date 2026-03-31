class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int it : nums){
            set.add(it);
        }

        return !(set.size() == n);
    }
}