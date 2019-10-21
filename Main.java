public class Main {
    /**
     * 测试面试题：
     * 1）复杂链表复制
     * 2）链表逆置
     * 3）链表的删除 val
     * ...
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();//定义一个Solution类的作为接受的变量
        testComplexListCopy(solution);
        //testReverseList();
        //testRemoveAll();
    }

    /**
     * 1. 构建几组测试数据
     * 2. 进行测试
     * 3. 对测试结果进行打印
     * @return
     */
    private static void testComplexListCopy(Solution solution) {
        // 1. 构建测试数据
        CNode head = createComplexList1();
        // 2. 进行测试
        CNode resultHead = solution.copy(head);//solution是Solution类下的变量，自然可以调用Solution类下的方法copy
        // 3. 对测试结果进行打印
        printCList(resultHead);
    }

    // CNode 必须有一个构造方法，形参是 int val
    // 并且，初始化后，next 和 random 都是 null
    private static CNode createComplexList1() {
        CNode n1 = new CNode(1);
        CNode n2 = new CNode(2);
        CNode n3 = new CNode(3);
        CNode n4 = new CNode(4);

        n1.random = n3; n2.random = n1; n3.random = n3;
        n1.next = n2; n2.next = n3; n3.next = n4;

        return n1;
    }

    // CNode 必须实现一个 String toString() 方法
    private static void printCList(CNode head) {
        for (CNode cur = head; cur != null; cur = cur.next) {
            System.out.print(cur + " --> ");
        }
        System.out.println();
    }
}
