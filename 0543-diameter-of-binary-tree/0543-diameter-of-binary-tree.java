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
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null){
            return 0;
        }

        int ld=diameterOfBinaryTree(root.left);//ledt diameter
        int lh=height(root.left);//left height
        int rd=diameterOfBinaryTree(root.right);//right diameter
        int rh=height(root.right);//right height

        int selfDia=lh+rh;//here they count by edges
        // int selfDia=lh+rh+1;  ---> when they count length of the path by node
        return Math.max(selfDia,Math.max(ld,rd));
    }
}