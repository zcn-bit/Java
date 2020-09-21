import java.util.List;
class ListNode{
    ListNode next=null;
   int  val=0;
    ListNode(int val){
        this.val=val;
    }
}
public class WuBa1 {

    public int getLength(ListNode head){
        int n=0;
        ListNode curr=head;
        while (curr!=null){

           curr = curr.next;
            n++;
        }
        return n;
    }
    public ListNode solution (ListNode head, int m, int n) {
        // write code here
       if(head != null ||head.next==null){
           return head;
       }
int len=getLength(head);
       if(m<1||n>len||m>n){
           return head;
       }
       //查找prem和nextn
       ListNode preM=null;
       ListNode nextN=null;
       ListNode node1=null;//遍历head
        int k=0;
        while (node1!=null){
            k++;
            if(k==(m-1)){
                preM=node1;
            }else {
                preM=preM;
            }
            if(k==(n+1)){
                nextN=node1;
            }else {
                nextN=nextN;
            }
            node1 = node1.next;
        }
        //node1==null

        if(preM==null){//node1为局部链表的首节点
            node1=head;
        }else{
            node1=preM.next;
        }

        ListNode cur=node1.next;
        node1.next=nextN;

        ListNode next=null;
        while (cur1=nextN){//遍历局部区间内的节点，不断往前插
            next = cur1.next;
            cur.next=node1;//往前插
            node1=cur;//node1一直为区间第一个元素
            cur=next;//更新遍历
        }

        if(preM!=null){
            preM.next=node1;
            return head;
        }
        return node1;
    }
}
