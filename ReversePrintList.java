
import java.util.*;
class ListNode {
       int val;
      ListNode next = null;
        ListNode(int val) {
            this.val = val; }

    }
public class ReversePrintList {
    ArrayList<Integer> list = new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}