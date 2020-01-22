
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public class Solution1 {
        boolean isSymmetrical(TreeNode pRoot)
        {
            return isMirror(pRoot,pRoot);
        }

        private boolean isMirror(TreeNode root1, TreeNode root2) {
            if(root1 ==null&& root2== null) return  true;
            if(root1 ==null||root2 == null) return  false;
            return (root1.val==root2.val)
                    && isMirror(root1.right,root2.left)
                    && isMirror(root1.left,root2.right);
        }
    }

