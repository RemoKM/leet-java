/*
Leetcode Problem number: 104
https://leetcode.com/problems/maximum-depth-of-binary-tree/
*/
class maxDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        else{
            int d_l = 1 + maxDepth(root.left);
            int d_r = 1 + maxDepth(root.right);
            if (d_l > d_r){
                return d_l;
            }
            else{
                return d_r;
            }
        }

    }
}
