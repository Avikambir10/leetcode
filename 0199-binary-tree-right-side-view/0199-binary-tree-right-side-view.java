/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> res;

    public List<Integer> rightSideView(TreeNode root) {
        res = new ArrayList<>();
        help(root, 0);
        return res;
    }

    void help(TreeNode root, int level) {
        if (root == null)
            return;

        if (res.size() == level) {
            res.add(root.val);
        }
        help(root.right, level + 1);
        help(root.left, level + 1);
    }
}