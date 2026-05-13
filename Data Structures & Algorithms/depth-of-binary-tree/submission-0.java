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
    public int maxDepth(TreeNode root) {
        int count = 0;
        return countNode(root,count);
    }

    public int countNode(TreeNode node,int count) {
        if(node == null) {
            return count;
        }
        return Math.max(countNode(node.left,count+1),countNode(node.right,count+1));
    }
}
