class Node {
    int val;
    Node next = null;

    public Node(int val) {
        this.val = val;
    }
}

public class Solution {
    Node removeAll(Node head, int val) {
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            if (cur.val == val) {
                if (cur == head) {
                    head = cur.next;
                } else {
                    prev.next = cur.next;
                }
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    Node merge(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        Node result = null;
        Node last = null;

        Node cur1 = head1;
        Node cur2 = head2;

        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                if (result == null) {
                    result = cur1;
                } else {
                    last.next = cur1;
                }
                last = cur1;
                cur1 = cur1.next;
            } else {
                if (result == null) {
                    result = cur2;
                } else {
                    last.next = cur2;
                }
                last = cur2;
                cur2 = cur2.next;
            }
        }

        if (cur1 != null) {
            last.next = cur1;
        } else {
            last.next = cur2;
        }

        return result;
    }

    public static Node createList() {
        Node n1 = new Node(6);
        Node n3 = new Node(2);
        Node n4 = new Node(6);
        Node n6 = new Node(4);
        Node n8 = new Node(6);

        n1.next = n3;
        n3.next = n4;
        n4.next = n6;
        n6.next = n8;

        return n1;
    }

    public static Node createList1() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);

        n1.next = n2;

        return n1;
    }

    public static Node createList2() {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;
    }

    public static void main(String[] args) {
        Node head = createList();

        Node result = new Solution().removeAll(head, 6);
        for (Node cur = result; cur != null; cur = cur.next) {
            System.out.println(cur.val);
        }

        System.out.println("=====================");

        Node head1 = createList1();
        Node head2 = createList2();
        Node merged = new Solution().merge(head1, head2);//类中的函数返回值是Node类型，用merge接收
        for (Node cur = merged; cur != null; cur = cur.next) {//merge相当于head，代表整个链表
            System.out.println(cur.val);
        }
    }
}
