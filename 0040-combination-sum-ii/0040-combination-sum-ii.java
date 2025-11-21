class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);
        backtrack(new ArrayList<>(), 0, candidates, target, ans);
        return ans;
    }

    static void backtrack(List<Integer> temp, int i, int[] candidate, int target, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int j = i; j < candidate.length; j++) {
            if (j > i && candidate[j] == candidate[j - 1])
                continue;

            if (candidate[j] > target)
                break;

            temp.add(candidate[j]);

            backtrack(temp, j + 1, candidate, target - candidate[j], ans);

            temp.remove(temp.size() - 1);
        }
    }
}