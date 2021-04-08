package leetCode;

import tree.TreeNode;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1
 */
public class Number110 {


    private boolean isBalanced(TreeNode root) {
        if (root == null) {// 空的平衡二叉树
            return true;
        } else {
            int leftDep = dep(root.left);
            int rightDep = dep(root.right);
            if (Math.abs(leftDep - rightDep) <= 1) { // 左右子树的最大深度差值不超过1
                return isBalanced(root.left) && isBalanced(root.right);
            } else {
                return false;
            }
        }
    }

    private int dep(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftDep = dep(node.left) + 1;
            int rightDep = dep(node.right) + 1;
            return Math.max(leftDep, rightDep);
        }
    }
}
