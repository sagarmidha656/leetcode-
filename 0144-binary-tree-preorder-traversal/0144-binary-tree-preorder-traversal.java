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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> arr = new ArrayList<>();
       pot(root,arr);
       return arr;
    }
    public void pot(TreeNode root, List<Integer> arr){
        if(root == null){
            return ;
        }
        arr.add(root.val);
        pot(root.left,arr);
        pot(root.right,arr);
    }
}
