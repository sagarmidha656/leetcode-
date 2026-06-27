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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();

        lo(root,arr);
        return arr;
    }
    public void lo(TreeNode root , List<List<Integer>> arr ){
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0 ; i<size;i++){
                TreeNode curr = q.poll();
                if(curr == null){
                    continue;
                }
                level.add(curr.val);
                if(curr.left != null){
                    q.offer(curr.left);
                }
                    if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            arr.add(level);
        }
    }
}