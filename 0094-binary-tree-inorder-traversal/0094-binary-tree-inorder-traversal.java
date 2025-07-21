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
import java.util.*;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root){
        ArrayList<Integer>ll=new ArrayList<>();
        inorderHelper(root,ll);
        return ll;
    }
    public static void inorderHelper(TreeNode root,ArrayList<Integer>ll){
        if(root==null){
            return;
        }
        inorderHelper(root.left,ll);
        ll.add(root.val);
        inorderHelper(root.right,ll);
    }
}