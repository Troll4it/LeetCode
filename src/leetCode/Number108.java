package leetCode;

/**
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树
 *
 * 解题思路：有序数组转为二叉搜索树，其实就是二分法；每次从中间取值为根，左侧部分数组的中间为左子叶，右侧部分数组的中间为右子叶
 */
public class Number108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums != null && nums.length > 0) {
            return arrayToBST(nums, 0, nums.length - 1);
        } else {
            return null;
        }
    }

    public TreeNode arrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        } else {
            int middle = (start + end) / 2;
            int value = nums[middle];
            return new TreeNode(value, arrayToBST(nums, start, middle - 1), arrayToBST(nums, middle + 1, end));
        }
    }
}
