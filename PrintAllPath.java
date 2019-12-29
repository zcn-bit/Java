import java.util.ArrayList;
public class PrintAllPath {


  class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }


        ArrayList<ArrayList<Integer>> result = new ArrayList();
        ArrayList<Integer> subresult = new ArrayList();
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
            if(root == null) return result;
            subresult.add(root.val);
            target = target - root.val;
            if(target == 0 && root.left == null && root.right == null){
                result.add(new ArrayList<Integer>(subresult));
            }
            FindPath(root.left,target);
            FindPath(root.right,target);
            subresult.remove(subresult.size() -1);
            return result;
        }

}
