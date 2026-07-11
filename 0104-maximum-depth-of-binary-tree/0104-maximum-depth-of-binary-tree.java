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

//  Add base case whenever we use recursive 
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left_d=maxDepth(root.left);
        int right_d=maxDepth(root.right);
        return Math.max(left_d,right_d)+1;//+1 also to count that node itselt
        // max depth=height of the tree
    }
}