package lendingkart;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class LevelOrderTraversal {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        System.out.println("Level-Order Traversal:");
        printLevelOrder(root);

        int distance = 2;
        int ans = countNodesAtDistanceD(root, distance);
        System.out.println("element from given distance is " + ans);

        printOuterView(root);

    }

    private static void printOuterView(TreeNode root) {
        if (root == null) {
            return;
        }

        // Print the root node
        System.out.print(root.val + " ");

        // Print the left boundary (excluding leaves)
        printLeftBoundary(root.left);

        // Print the leaves in left-to-right order
        printLeaves(root);

        // Print the right boundary (excluding leaves)
        printRightBoundary(root.right);
    }

    private static void printLeftBoundary(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }

        System.out.print(node.val + " ");
        if (node.left != null) {
            printLeftBoundary(node.left);
        } else {
            printLeftBoundary(node.right);
        }

    }

    private static void printLeaves(TreeNode node) {

        if (node == null) {
            return;
        }

        printLeaves(node.left);

        if (node.left == null && node.right == null) {
            System.out.print(node.val + " ");
        }

        printLeaves(node.right);
    }

    private static void printRightBoundary(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }

        if (node.right != null) {
            printRightBoundary(node.right);
        } else {
            printRightBoundary(node.left);
        }
        System.out.print(node.val + " ");

    }


    private static int countNodesAtDistanceD(TreeNode root, int distance) {
        if (root == null)
            return 0;
        if (distance == 0)
            return 1;

        int lCount = countNodesAtDistanceD(root.left, distance - 1);
        int rCount = countNodesAtDistanceD(root.right, distance - 1);
        return lCount + rCount;

    }


    /*private static void printLevelOrder(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null)
                queue.offer(node.right);
        }
    }*/

    //each line in new row
    private static void printLevelOrder(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);

            }
            System.out.println();
        }
    }


}
