class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();  
        String longest = ""; // Variable to store the longest palindromic substring

        // Iterate through each character to check for palindromes centered at each index
        for (int i = 0; i < n; i++) {
            // Expand around a single center (odd-length palindrome)
            String odd = expandFromCenter(s, i, i);
            // Expand around two centers (even-length palindrome)
            String even = expandFromCenter(s, i, i + 1);

            // Update longest palindrome if a longer one is found
            if (odd.length() > longest.length()) longest = odd;
            if (even.length() > longest.length()) longest = even;
        }
        return longest; // Return the longest palindromic substring found
    }

    // Helper function to expand around the center and find the longest palindrome
    String expandFromCenter(String s, int l, int r) {
        // Expand as long as the characters at left and right match
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--; // Move left pointer left
            r++; // Move right pointer right
        }
        // Return the palindrome found (excluding the extra indices that broke the condition)
        return s.substring(l + 1, r);
    }
}
