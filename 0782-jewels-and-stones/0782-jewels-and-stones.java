class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt = 0;

        boolean[] map = new boolean[128];

        for (char ch : jewels.toCharArray()) {
            map[ch] = true;
        }

        for (char ch : stones.toCharArray()) {
            if (map[ch])
                cnt++;
        }

        return cnt;
    }
}