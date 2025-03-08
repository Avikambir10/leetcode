import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>(); // HashSet to store unique characters in the current window
        int l = 0; // Left pointer of the sliding window
        int res = 0; // Variable to store the maximum length of unique substring

        for (int r = 0; r < s.length(); r++) { // Iterate through the string with the right pointer
            while (set.contains(s.charAt(r))) { // If duplicate character found, shrink window from the left
                set.remove(s.charAt(l)); // Remove leftmost character from the set
                l++; // Move left pointer to the right
            }
            set.add(s.charAt(r)); // Add current character to the set
            res = Math.max(res, r - l + 1); // Update the result with the maximum length found
        }
        return res; // Return the length of the longest unique substring
    }
}
