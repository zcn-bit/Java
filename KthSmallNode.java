

import java.util.ArrayList;
public class KthSmallNode {
 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}


    TreeNode KthNode(TreeNode pRoot, int k)
    {
        ArrayList<TreeNode> list = new ArrayList<>();
        inOrderRecur(pRoot,list);
        int len = list.size();
        if(k < 1 || k > len){
            return null;
        }
        TreeNode result = list.get(k-1);
        return result;
    }
    public void inOrderRecur(TreeNode pRoot,ArrayList<TreeNode> list){
        if(pRoot == null){
            return;
        }
        inOrderRecur(pRoot.left,list);
        list.add(pRoot);
        inOrderRecur(pRoot.right,list);
    }
}

