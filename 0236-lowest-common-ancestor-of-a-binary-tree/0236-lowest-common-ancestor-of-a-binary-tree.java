/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */



class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // base case
        if(root==null){
            return null;
        }

        if(root==p||root==q){
            return root;
        }
        // finding if node p and q present on left subtree
TreeNode leftResult=lowestCommonAncestor(root.left,p,q);
TreeNode rightResult=lowestCommonAncestor(root.right,p,q);

// both nodes are found on left subtree
if(rightResult==null){
    return leftResult;
}
// both nodes are found on right subtree
if(leftResult==null){
    return rightResult;
}

return root;
    }
}