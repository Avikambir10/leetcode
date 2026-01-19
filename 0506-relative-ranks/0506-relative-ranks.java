class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            indexMap.put(score[i], i);
        }
        String[] ans = new String[score.length];

        int rank = 1;
        while (!pq.isEmpty()) {
            int curr = pq.poll();
            int value = indexMap.get(curr);
            if (rank == 1) {
                ans[value] = "Gold Medal";
            } else if (rank == 2) {
                ans[value] = "Silver Medal";
            } else if (rank == 3) {
                ans[value] = "Bronze Medal";
            } else {
                ans[value] = String.valueOf(rank);
            }
            rank++;
        }
        return ans;
    }
}