public class NextNode {

    class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }


        public TreeLinkNode GetNext(TreeLinkNode pNode)
        {
            TreeLinkNode father = pNode.next;
            if(pNode == null){
                return null;
            }
            if(pNode.right != null){
                return haveRightChild(pNode.right);
            }
            if(father == null){
                return null;
            }
            if(father.left == pNode){
                return father;
            }
            return isFathersRightChild(pNode);
        }

        public TreeLinkNode haveRightChild(TreeLinkNode node){
            if(node.left == null){
                return node;
            }
            return haveRightChild(node.left);
        }

        public TreeLinkNode isFathersRightChild(TreeLinkNode node){
            TreeLinkNode father = node.next;
            TreeLinkNode fathersFather = father.next;
            if(fathersFather == null){
                return null;
            }
            if(fathersFather.left == father){
                return fathersFather;
            }
            return null;
        }
    }

