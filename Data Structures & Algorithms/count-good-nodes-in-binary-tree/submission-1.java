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
    public int goodNodes(TreeNode root) {
        return countgoodNodes(root,Integer.MIN_VALUE);
    }

    public int countgoodNodes(TreeNode node, int max) {
        int count = 0;
        if(node == null) return count;
        if(node.val >= max) {
            count++;
            max = node.val;
        }
        return count + countgoodNodes(node.left,max) + countgoodNodes(node.right,max);
    }

}
