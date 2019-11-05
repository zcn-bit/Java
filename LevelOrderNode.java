import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    private static class Node {
        char val;
        Node left;
        Node right;

        Node(char val) {
            this.val = val;
        }
    }

    public static void levelOrder(Node root) {//按照层序法打印元素值，先出栈，再进去它的左右孩子结点
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node front = queue.poll();
            System.out.println(front.val);
            if (front.left != null) {
                queue.offer(front.left);
            }
            if (front.right != null) {
                queue.offer(front.right);
            }
        }
    }

    public static Node buildTree() {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.right = h;

        return a;
    }

    private static class NodeLevel {//结点和所在层数
        public Node node;
        public int level;

        NodeLevel(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public static void levelOrder2(Node root) {
        if (root == null) {
            return;
        }
        Queue<NodeLevel> queue = new LinkedList<>();
        queue.offer(new NodeLevel(root, 1));//先放一个初值，root是建造的树的根（第一个结点）
        while (!queue.isEmpty()) {
            NodeLevel front = queue.poll();//记录先进去先出来的结点
            System.out.println(front.level + ":" + front.node.val);//front是NodeLevel类变量，调用包类的level和node属性
            if (front.node.left != null) {
                queue.offer(new NodeLevel(front.node.left,
                        front.level + 1));//front出的谁，放进去谁的孩子结点
            }
            if (front.node.right != null) {
                queue.offer(new NodeLevel(front.node.right,
                        front.level + 1));
            }
        }
    }

    public static boolean isCompleteTree(Node root) {//是否完全二叉树
        if (root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (true) {
            Node front = queue.poll();
            // 判断 front 是不是空结点
            if (front == null) {
                break;
            }
            queue.offer(front.left);
            queue.offer(front.right);
        }
        // 去检查队列中剩下的是否全为 null 了
        while (!queue.isEmpty()) {//非空，还有剩余元素
            Node n = queue.poll();//出栈最近的一个结点
            if (n != null) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Node root = buildTree();
        levelOrder2(root);
    }
}
