/**
https://leetcode.com/problems/symmetric-tree/
101
**/

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
class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return checkSymm(root.left, root.right);
    }

    public boolean checkSymm(TreeNode left, TreeNode right){

        if(left == null || right == null){
            return left == right;
        }

        if(left.val != right.val){
            return false;
        }
        return checkSymm(left.left, right.right) && checkSymm(left.right, right.left);

    }





}
