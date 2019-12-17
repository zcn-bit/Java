/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.HashMap;
public class Solution {

      class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    public  TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        int len = pre.length;
        TreeNode head = new TreeNode(pre[0]);
        return reConstructBinaryTree(pre, 0, len - 1, in, 0, len - 1);
    }

    public  TreeNode reConstructBinaryTree(int[] pre, int pstart, int pend, int[] in, int istart, int iend) {
        if (pstart > pend || istart > iend) {
            return null;
        }
        TreeNode treeNode = new TreeNode(pre[pstart]);
        for (int i = istart; i <= iend; ++i) {
            if (in[i] == pre[pstart]) {
                // i-istart=左节点个数
                treeNode.left = reConstructBinaryTree(pre, pstart + 1, pstart + i - istart, in, istart, i - 1);
                treeNode.right = reConstructBinaryTree(pre, pstart + i - istart+1, pend, in, i + 1, iend);
            }
        }
        return treeNode;
    }
}