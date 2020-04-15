import java.util.*;
public class Main7 {
    public static void main(String[] args) {
        ListNode root = new ListNode(0);//root始终为头指针
        Scanner scanner = new Scanner(System.in);
        ListNode curIn = root;//curin移动改变构造起链表
        int n = scanner.nextInt();//链表节点个数
        //输入链表节点
        for (int i = 0; i < n; i++) {
            curIn.next = new ListNode(scanner.nextInt());
            curIn = curIn.next;
        }
        root = deleteDuplication(root.next);
        while (root != null) {
            System.out.print(root.val);
            root = root.next;
        }
    }

    private static ListNode deleteDuplication(ListNode node) { //参数首元结点

        if (node == null) {
            return null;
        }
        ListNode pre = node;
        ListNode first = node;
        if (node.next != null) { //最少有两个元素
            //ListNode pre=node;
            //ListNode first=node;
            node = node.next;
            if (first.val != first.next.val) {
                while (node.next != null) {//开始遍历
                    if (node.val != node.next.val) {
                        node = node.next;
                        pre = pre.next;//pre始终为当前节点的直接前驱
                    } else {//==
                        while (node.val == node.next.val) {
                            node = node.next;
                        }//最后一个重复元素
                        node = node.next;
                        pre.next = node;
                    }
                }


            } else { //一开始就是重复元素
                while (node.val == node.next.val) {
                    node = node.next;
                }//zou走到最后一个重复元素
                node = node.next;
                first = node;
                deleteDuplication(first);//把前面重复的丢弃重新开始


            }


        }
        return first;//只有一个元素
//        if(pHead==null)
//            return pHead;
//        ListNode printNode=new ListNode(0);
//        ListNode currentNode=printNode;
//        while(pHead!=null){
//            int val=pHead.val;
//            if(pHead.next!=null&&val==pHead.next.val){
//                while(pHead!=null&&val==pHead.val){
//                    pHead=pHead.next;
//                }
//            }else{
//                currentNode.next=pHead;
//                currentNode=currentNode.next;
//                pHead=pHead.next;
//            }
//            if(pHead==null)
//                currentNode.next=null;
//        }
//        return printNode.next;

    }
}

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

