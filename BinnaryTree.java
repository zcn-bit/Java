public class BinnaryTree {

    //交换左右子树

   class TreeNode{
        int val;//数据域
        TreeNode left=null;
        TreeNode right=null;
        public  TreeNode(int val){//构造函数
            this.val=val;

        }


    }
    public void Mirror(TreeNode root) {
  if(root==null){//没有结点
      return;
  }
  if(root.left==null&&root.right==null){//只有一个根结点无孩子
      return;
  }

   //有孩子

  //交换左右孩子   先处理根
  TreeNode temp=root.left;
  root.left=root.right;
  root.right=temp;

  //递归
  Mirror(root.left);
  Mirror(root.right);


    }
}
