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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        // do inorder to add to add bst to list 
        inorder(root1, l1);
        inorder(root2, l2);
        
        //merge
        return merge(l1,l2);

    }
    
    void inorder(TreeNode node ,List<Integer> l){
        if(node == null)return;
        
       
        inorder(node.left, l); 
        l.add(node.val);
        inorder(node.right, l);
    }
    
    List<Integer> merge(List<Integer> l1,List<Integer> l2){
        List<Integer>res = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        while(i < l1.size() && j < l2.size()){
            if(l1.get(i) < l2.get(j)){
                res.add(l1.get(i++));
            }else{
                res.add(l2.get(j++));
            }
        }
        
        
        while(i < l1.size())res.add(l1.get(i++));
        while(j < l2.size())res.add(l2.get(j++));
        
        return res;
    }
}