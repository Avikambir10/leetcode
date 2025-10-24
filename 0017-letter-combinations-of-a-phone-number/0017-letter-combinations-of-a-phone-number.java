class Solution {
    String[] letters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0)
            return res;
        comb(res, digits, new StringBuilder(), 0);
        return res;
    }

    void comb(List<String> res, String digits, StringBuilder ans, int idx) {
        if (digits.length() == idx) {
            res.add(ans.toString());
            return;
        }

        String letter = letters[digits.charAt(idx) - '0'];

        for (char ch : letter.toCharArray()) {
            ans.append(ch);
            comb(res, digits, ans, idx + 1);
            ans.deleteCharAt(ans.length() - 1);
        }

    }
}