public class Circle {
//   public static ListNode{
//        int val;
//        ListNode next=null;
//        ListNode(int val){
//          this.val=val;
//
//            //val= this.val;
//        }
//    }
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(fast==null){
            return false;
        }
        if(fast.next==null){
            return false;
        }

        while (fast!=slow){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==null){
                break;
            }
        }
        if(fast==slow){
            return true;
        }else {
            return false;
        }

    }
}
