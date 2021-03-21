import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution_tree {
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
    List<Integer> list = new ArrayList<>();
    // 先序遍历，迭代
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                list.add(root.val);
                root = root.left;
            }
            root = stack.pop().right;
        }
        return list;
    }
    // 中序遍历，迭代
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            list.add(stack.peek().val);
            root = stack.pop().right;
        }
        return list;
    }

    // 递归
    public void helper(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}
