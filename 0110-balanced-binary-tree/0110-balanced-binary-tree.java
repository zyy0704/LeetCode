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
    public boolean isBalanced(TreeNode root) {
        
        if(root == null){
            return true;
        }
        
        return (bf(root) != -1);
    }
    
    public int bf(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int l = bf(root.left);
        int r = bf(root.right);
        
        int bf = Math.abs(l - r);
        
        if(bf > 1 || l == -1 || r == -1){
            return -1;
        }
        
        return 1 + Math.max(l,r);
    }
}