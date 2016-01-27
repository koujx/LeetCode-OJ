package LeetCode.util;

/**
 * created by koujx on 2016/1/25.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            int maxL = 1;
            return Math.max(Math.max(maxDepth(root.left), maxDepth(root.right)) + 1, maxL);
        }
    }
}
