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
    void dfs(TreeNode root, ArrayList arr) {
        if (root == null)
            return;
        arr.add(root);
        dfs(root.left, arr);
        dfs(root.right, arr);
    }

    public void flatten(TreeNode root) {
        if (root == null || root.left == null && root.right == null)
            return;
        ArrayList<TreeNode> arr = new ArrayList<>();
        dfs(root, arr);
        TreeNode temp = root;
        for (int i = 0; i < arr.size(); i++) {
            temp.right = arr.get(i);
            temp.left = null;
            temp = temp.right;
        }
    }
}11
