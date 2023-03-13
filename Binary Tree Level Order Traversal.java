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
        List<List<Integer>> finval = new ArrayList<>();
        if(root == null){
            return finval;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(0 != q.size()){
            int val = q.size();
            List<Integer> arr = new ArrayList<>();
            while(val-- != 0){
                TreeNode x = q.remove();
                arr.add(x.val);
                if(x.left != null){
                    q.add(x.left);
                }
                if(x.right != null){
                    q.add(x.right);
                }
            }
            finval.add(arr);
        }
        return finval;
    }
}
