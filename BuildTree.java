import java.util.Arrays;
import java.util.TreeSet;

class TreeNode{
    int val;
    TreeNode next=null;
    TreeNode left=null;
    TreeNode right=null;
    TreeNode(int val){
        this.val=val;
    }
}
public class BuildTree {

   private TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        int rootValue=preorder[0];
        int leftCount=0;
        for( leftCount=0;leftCount<inorder.length;leftCount++){
            if(inorder[leftCount]==rootValue){
                break;
            }
        }//i==左子树节点个数
       // int leftCount=i;
        TreeNode root=new TreeNode(rootValue);//装箱
        int[] leftPreorder=Arrays.copyOfRange(preorder,1,1+leftCount);//[ )
        int[] leftInorder=Arrays.copyOfRange(inorder,0,leftCount);
        root.left=buildTree(leftPreorder,leftInorder);
        int[] rightPreorder=Arrays.copyOfRange(preorder,1+leftCount,preorder.length);//[ )
        int[] rightInorder=Arrays.copyOfRange(inorder,leftCount+1,inorder.length);//越过中间的根节点
        root.right=buildTree(rightPreorder,rightInorder);
        return root;

    }
}
