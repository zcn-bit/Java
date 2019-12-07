import java.util.*;
 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Blanced {
public static int getHight(TreeNode root){

    if(root==null){
        return 0;
    }
    int lh=  getHight(root.left);
    int rh=getHight(root.right);
   int high=Math.max(lh,rh);
    return  high+1;
}

    public boolean isBalance(TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
      int lh=  getHight(root.left);
        int rh=getHight(root.right);
        if((lh-rh<=1&&lh-rh>=0)||(rh-lh<=1&&rh-lh>=0)){
            return true;
        }else{
            return  false;
        }
    }
}
