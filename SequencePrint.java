
import java.util.ArrayList;
        import java.util.LinkedList;
        import java.util.Queue;

public class SequencePrint {
 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}


    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int toBePrinted = 1;
        int nextLine = 0;
        if (pRoot == null) return ret;
        queue.add(pRoot);
        ArrayList<Integer> sublist = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            sublist.add(node.val);
            toBePrinted--;

            if (node.left != null){
                queue.add(node.left);
                nextLine++;
            }
            if (node.right != null){
                queue.add(node.right);
                nextLine++;
            }
            if (toBePrinted == 0){
                ret.add(sublist);
                sublist = new ArrayList<>();  // 重新初始化sublist
                toBePrinted = nextLine;
                nextLine = 0;
            }
        }
        return ret;
    }
}