package leetCode;

import tree.TreeNode;

/**
 * 二叉树的最小深度
 */
public class Number111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + getMinDepth(root);
        }
    }

    private int getMinDepth(TreeNode node) {
        if (node.left == null && node.right == null) { // 此节点为叶子节点
            return 0;
        } else if (node.left == null) { // 左子树为空就返回右子树的深度
            return 1 + getMinDepth(node.right);
        } else if (node.right == null) {
            return 1 + getMinDepth(node.left);
        } else {
            return 1 + Math.max(getMinDepth(node.left), getMinDepth(node.right));
        }
    }

}
