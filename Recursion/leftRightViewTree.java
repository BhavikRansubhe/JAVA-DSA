package Recursion;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class leftRightViewTree {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightViewDFS(root, 0, result);
        return result;
    }

    private static void rightViewDFS(TreeNode node, int depth, List<Integer> result) {
        if (node == null) {
            return;
        }

        // If the current depth is equal to the size of the result list,
        // add the current node value to the result list.
        if (depth == result.size()) {
            result.add(node.val);
        }

        // Traverse the right subtree first, as we want the rightmost node.
        rightViewDFS(node.right, depth + 1, result);
        rightViewDFS(node.left, depth + 1, result);
    }

    public static void main(String[] args) {
        // Example usage:
        // Constructing a sample binary tree:    1
        //                                       / \
        //                                      2   3
        //                                       \
        //                                        5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<Integer> rightView = rightSideView(root);
        System.out.println("Right view of the binary tree: " + rightView);
    }
}
