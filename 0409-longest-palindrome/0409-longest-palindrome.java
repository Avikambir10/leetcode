class Solution {
    public int longestPalindrome(String s) {
        int cnt = 1;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        boolean odd = false;
        int len = 0;

        for (int freq : map.values()) {
            len += (freq / 2) * 2;
            if (freq % 2 == 1)
                odd = true;
        }

        return odd ? len + 1 : len;
    }
}