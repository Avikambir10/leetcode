class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int min_ele = Integer.MAX_VALUE;
        int max_ele = Integer.MIN_VALUE;
        for(int i = 0; i < n ;i++ ){
            max_ele = Math.max(max_ele,nums[i]);
            min_ele = Math.min(min_ele,nums[i]);
            set.add(nums[i]);
        }

        for(int i = min_ele; i< max_ele ;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}