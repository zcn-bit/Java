import java.util.Arrays;
import java.util.TreeSet;

public class Solution {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int rootValue = preorder[0];
        int leftCount;
        for (leftCount = 0; leftCount < inorder.length; leftCount++) {
            if (inorder[leftCount] == rootValue) {
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);
        int[] leftPreorder = Arrays.copyOfRange(preorder,
                1, 1 + leftCount);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, leftCount);
        root.left = buildTree(leftPreorder, leftInorder);
        int[] rightPreorder = Arrays.copyOfRange(preorder,
                1 + leftCount, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder,
                leftCount + 1, inorder.length);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }

    public TreeNode buildTree2(int[] i, int[] p) {
        if (i.length == 0) { return null; }
        int r = p[p.length - 1];
        int lc = indexOf(i, r);
        TreeNode root = new TreeNode(r);
        int[] li = Arrays.copyOfRange(i, 0, lc);
        int[] lp = Arrays.copyOfRange(p, 0, lc);
        root.left = buildTree2(li, lp);
        int[] ri = Arrays.copyOfRange(i, lc + 1, i.length);
        int[] rp = Arrays.copyOfRange(p, lc, p.length - 1);
        root.right = buildTree2(ri, rp);

        return root;
    }

    private int indexOf(int[] a, int r) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == r) {
                return i;
            }
        }
    }
}
