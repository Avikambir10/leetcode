class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int i = 0, j = s.length() - 1, flips = 0;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) flips += 2;
            i++;
            j--;
        }
        return flips;
    }
}