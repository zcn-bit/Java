import java.util.*;

public class BinaryTree {
    public static class Node {
        public char val;
        public Node left = null;
        public Node right = null;

        private Node(char val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.format("{%c}", val);
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

    public static void preOrderTraversal(Node root) {
        // 如何找终止条件，肯定是在形参中
        if (root == null) {
            return;
        }

        // 根 + 左子树的前序遍历 + 右子树的前序遍历
        System.out.println(root);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        // 左子树的中序遍历 + 根 + 右子树的中序遍历
        inOrderTraversal(root.left);
        System.out.println(root);
        inOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root);
    }
    private static int count = 0;
    public static void getSize(Node root) {
        if (root == null) {
            return;
        }
        count++;
        getSize(root.left);
        getSize(root.right);
    }

    public static int getSize2(Node root) {
        if (root == null) {
            return 0;
        }

        int left = getSize2(root.left);
        int right = getSize2(root.right);
        // 汇总(left, right)
        return left + right + 1;
    }

    private static List<Character> inorderList = new ArrayList<>();
    private static void inorderReturnList(Node root) {
        if (root != null) {
            inorderReturnList(root.left);
            inorderList.add(root.val);
            inorderReturnList(root.right);
        }
    }

    private static List<Character> inorderReturnList2(Node root) {
        List<Character> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        list.addAll(inorderReturnList2(root.left));
        list.add(root.val);
        list.addAll(inorderReturnList2(root.right));
        return list;
    }

    private static int leafSize = 0;
    private static void getLeafSize(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize(root.left);
        getLeafSize(root.right);
    }

    public static int getLeafSize2(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = getLeafSize2(root.left);
        int right = getLeafSize2(root.right);
        return left + right;
    }

    public static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left, right) + 1;
    }

    // K >= 1，如果 k < 1，方法无法处理
    public static int getKLevel(Node root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }

        return getKLevel(root.left, k - 1)
                + getKLevel(root.right, k - 1);
    }

    public static Node find(Node root, int val) {
        if (root == null) { return null; }
        if (root.val == val) { return root; }
        Node n = find(root.left, val);
        if (n != null) { return n; }
        n = find(root.right, val);
        if (n != null) { return n; }
        return null;
    }

    public static boolean find2(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        }
        if (find2(root.left, val)) {
            return true;
        }

        return find2(root.right, val);
    }

    public static boolean find3(Node root, int val) {
        return root != null
                && (
                        root.val == val
                                || find3(root.left, val)
                                || find3(root.right, val)
        );
    }

    public static List<Character> post(Node root) {
        List<Character> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Character> left = post(root.left);
        List<Character> right = post(root.right);
        result.addAll(left);
        result.addAll(right);
        result.add(root.val);
        return result;
    }

    public static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null) {
            return false;
        }
        if (q == null) {
            return false;
        }
        return p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
    // t 是不是 s 的一棵子树，s 和 t 一定都不为空
    public static boolean isSubTree(Node s, Node t) {
        // 在 s 这树中查找是否有和 t 相等的树
        if (s == null) {
            return false;
        }
        // 先看根所在的树不是否和 t 相同
        if (isSameTree(s, t)) {
            return true;
        }
        // 继续去左子树中查找
        if (isSubTree(s.left, t)) {
            return true;
        }
        if (isSubTree(s.right, t)) {
            return true;
        }
        return false;
    }

    public int[] prevPermOpt1(int[] A) {
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > A[i + 1]) {
                // 1. 比 A[i] 小
                // 2. 小的最大的
                // 3. 如果相等，取左边的
                int maxIndex = -1;
                int max = Integer.MIN_VALUE;
                for (int j = i + 1; j < A.length; j++) {
                    if (A[j] < A[i] && A[j] > max) {
                        max = A[j];
                        maxIndex = j;
                    }
                }
                // i 是要交换的位置
                // maxIndex 就是要交换的位置
                if (maxIndex != -1) {
                    int t = A[i];
                    A[i] = A[maxIndex];
                    A[maxIndex] = t;
                }
                return A;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        Node root = buildTree();
        System.out.println("Success");
        preOrderTraversal(root);
        System.out.println("====================");
        inOrderTraversal(root);
        System.out.println("====================");
        postOrderTraversal(root);
        System.out.println("====================");
        count = 0;
        getSize(root);
        System.out.println("结点个数: " + count);
        System.out.println("结点个数: " + getSize2(root));

        System.out.println("====================");
        inorderList.clear();
        inorderReturnList(root);
        System.out.println(inorderList);
        System.out.println(inorderReturnList2(root));
        System.out.println("====================");
        leafSize = 0;
        getLeafSize(root);
        System.out.println("叶子结点个数： " + leafSize);
        System.out.println(getLeafSize2(root));
        System.out.println("====================");
        System.out.println(getHeight(root));
        System.out.println("====================");
        System.out.println(getKLevel(root, 1)); // 1
        System.out.println(getKLevel(root, 2)); // 2
        System.out.println(getKLevel(root, 3)); // 4
        System.out.println(getKLevel(root, 4)); // 1
        System.out.println(getKLevel(root, 5)); // 0
    }
}
