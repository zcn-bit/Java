import java.util.LinkedList;

public class Partition {

 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

    //新建链表L1  L2   挂在一起  放到原链表
        public ListNode partition(ListNode pHead, int x) {
LinkedList <Integer>  L1=new LinkedList<>();
LinkedList <Integer>  L2=new LinkedList<>();

            ListNode cur=pHead;//头指针

            while(cur!=null){
                if(cur.val<x){
                  L1.add(cur.val);//cur一进来就放
                }
                else{
                    L2.add(cur.val);
                }
                cur=cur.next;

            }

     L1.addAll(L2);
            //L1bianle


           pHead.val=L1.get(0);
            cur=pHead.next;
            for(int i=1;i< L1.size();i++){
              cur.val=  L1.get(i);
              cur=cur.next;
            }//把值放进原 链表

            return   pHead;




        }

}
