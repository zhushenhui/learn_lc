//101. 对称二叉树
public class Solution_101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isCheck(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isCheck(p.left, q.right) && isCheck(p.right, q.left);
    }

    // 做法和100题差不多，递归调用。主要找到递归的结束条件和
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isCheck(root.left, root.right);
    }
}
