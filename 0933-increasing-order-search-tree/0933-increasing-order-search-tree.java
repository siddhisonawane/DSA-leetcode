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
class Solution{
    public static void inOrder(TreeNode root,ArrayList<Integer>arr){
        if(root==null){
        return;
        }
        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);
    }
    public static TreeNode increasingBST(TreeNode root){
        ArrayList<Integer>arr=new ArrayList<>();
        inOrder(root,arr);

        TreeNode newTree = new TreeNode(0);
        TreeNode current = newTree;

        for (int val : arr) {
            current.right = new TreeNode(val);
            current = current.right;
        }

        return newTree.right;
    }
}