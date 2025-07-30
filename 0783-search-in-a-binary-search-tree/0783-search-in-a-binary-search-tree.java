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
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return root;
        }

        if(root.val>val){
            return searchBST(root.left,val);
        }
        else if(root.val<val){
            return searchBST(root.right,val);
        }
        else{
            System.out.print(root.val+" ");
            searchBST(root.left,val);
            searchBST(root.right,val);
        }
        return root;
    }
}