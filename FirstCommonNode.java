public class FirstCommonNode {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            int count1 = 0;
            int count2 = 0;
            ListNode commonNode = null;
            ListNode pNode1 = pHead1;
            ListNode pNode2 = pHead2;
            while (pNode1 != null) {
                count1 += 1;
                pNode1 = pNode1.next;
            }
            while (pNode2 != null) {
                count2 += 1;
                pNode2 = pNode2.next;
            }
            pNode1 = pHead1;
            pNode2 = pHead2;
            if (count1 >= count2) {
                int count = count1 - count2;
                while (count != 0) {
                    pNode1 = pNode1.next;
                    count -= 1;
                }
            } else {
                int count = count2 - count1;
                while (count != 0) {
                    pNode2 = pNode2.next;
                    count -= 1;
                }
            }
            while (pNode1 != null && pNode2 != null) {
                if (pNode1 == pNode2) {
                    commonNode = pNode1;
                    return commonNode;
                }
                pNode1 = pNode1.next;
                pNode2 = pNode2.next;
            }
            return commonNode;
        }
    }

