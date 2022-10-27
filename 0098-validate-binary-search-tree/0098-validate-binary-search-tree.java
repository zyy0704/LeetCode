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
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        
        return helper(root.left,null,root.val) && helper(root.right, root.val, null);
        
    }
    
    public boolean helper(TreeNode root, Integer lo, Integer hi){
        if(root == null){
            return true; 
        }
        if(lo != null){
            if(root.val <= lo){
                return false;
            }
        }
        
        if(hi != null){
            if(root.val >= hi){
                return false;
            }
        }
       
        return helper(root.left, lo,root.val) && helper(root.right, root.val, hi);
        
    }
}