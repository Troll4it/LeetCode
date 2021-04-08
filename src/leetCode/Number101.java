package leetCode;


import tree.TreeNode;

/**
 * 检查是否是一颗对称二叉树
 */
public class Number101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        } else {
            return isSame(root.left, root.right);
        }
    }

    private boolean isSame(TreeNode left, TreeNode right) {
        if (left == null && right == null) { // 有一个为空
            return true;
        } else if (left != null && right != null) {
            if (left.value == right.value) {
                return isSame(left.left, left.right) && isSame(right.left, right.right);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
