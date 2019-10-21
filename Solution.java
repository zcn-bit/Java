public class Solution {
    CNode copy(CNode head) {//copy是Solution类下的方法
        if (head == null) {
            return null;
        }

        CNode p1 = head;
        while (p1 != null) {//新旧挂钩
            CNode p2 = new CNode(p1.val);//拷贝结点

            p2.next = p1.next;
            p1.next = p2;

            p1 = p2.next;
        }

        p1 = head;
        while (p1 != null) {//复制指向   让新的1指向新的2
            CNode p2 = p1.next;
            if (p1.random != null) {
                p2.random = p1.random.next;
            }

            p1 = p2.next;
        }

        p1 = head;
        CNode newHead = head.next;//创造新链表的头结点
        while (p1 != null) {//拆开新旧
            CNode p2 = p1.next;
            p1.next = p2.next;
            if (p2.next != null) {
                p2.next = p2.next.next;
            }

            p1 = p1.next;//相当于更新cur
        }

        return newHead;
    }
}
