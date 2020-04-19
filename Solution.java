
public class Solution {
    private int getLength(ListNode head) {
        int len = 0;
        for (ListNode c = head; c != null; c = c.next) {
            len++;
        }

        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        ListNode longer = headA;
        ListNode shorter = headB;
        int diff = lenA - lenB;
        if (lenA < lenB) {
            longer = headB;
            shorter = headA;
            diff = lenB - lenA;
        }

        for (int i = 0; i < diff; i++) {
            longer = longer.next;
        }

        while (longer != shorter) {
            longer = longer.next;
            shorter = shorter.next;
        }

        return longer;
    }
}


