public class ReserveHead {

 class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

     private ListNode ReverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode next = head.next;
            head.next = null;
            ListNode newHead = ReverseList(next);
            next.next = head;
            return newHead;
        }

}
