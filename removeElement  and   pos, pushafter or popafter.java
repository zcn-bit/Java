class Node {
    int val;
    Node next = null;

    Node(int val) {
        this.val = val;
    }

    public String toString() {
        return String.format("Node(%d)", val);
    }
}

class Solution {
    public Node removeElements(Node head, int val) {
        Node result = null;
        Node last = null;   // 记录目前 result 中的最后一个结点

        Node cur = head;
        while (cur != null) {
            if (cur.val == val) {
                cur = cur.next;
                continue;
            }

            Node next = cur.next;

            cur.next = null;
            if (result == null) {
                result = cur;
            } else {
                last.next = cur;
            }

            last = cur;

            cur = next;
        }

        return result;
    }
}

public class MyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);//pos
        head.next.next.next = new Node(4);

        Node pos = head.next.next;
        pushAfter(pos, 100);//在pos之后入100

        // 1, 2, 3, 100, 4
    }

    private static void pushAfter(Node pos, int val) {
        Node node = new Node(val);

        node.next = pos.next;
        pos.next = node;
    }

    private static void popAfter(Node pos) {
        pos.next = pos.next.next;
    }
}




