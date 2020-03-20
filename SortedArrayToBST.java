/*
Leetcode problem : 108
https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode newTreeNode = new TreeNode();
        if(nums == null || nums.length == 0){
            return null;
        }else if(nums.length == 1){
            newTreeNode.val = nums[0];
            newTreeNode.left = null;
            newTreeNode.right = null;

        }else{
            int n = nums.length;
            newTreeNode.val = nums[n/2];
            int[] leftNums = new int[n/2];
            int[] rightNums = new int[n -1 - n/2];
            System.arraycopy(nums,0,leftNums,0,leftNums.length);
            System.arraycopy(nums,n/2 + 1,rightNums,0,rightNums.length);

            newTreeNode.left = sortedArrayToBST(leftNums);
            newTreeNode.right = sortedArrayToBST(rightNums);
        }
        return newTreeNode;

    }
}
