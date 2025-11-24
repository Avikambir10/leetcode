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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null)
            return list;

        
        func(list, root, "");
        return list;
    }

    void func(List<String> list, TreeNode node, String ans) {
        if(node == null)return;

        if (node.left == null && node.right == null) {
            list.add(ans + node.val);
        }

        if (node.left != null) {
            func(list, node.left, ans + node.val + "->");
        }
        if (node.right != null) {
            func(list, node.right, ans + node.val + "->");
        }
    }
}