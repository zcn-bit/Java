import java.util.Stack;
public class MinEelementOfStack {





        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        /**
         * 首先需要对stack执行入栈操作,
         * 判断minStack中是否需要入栈操作
         */
        public void push(int node) {
            stack.push(node);
            if(minStack.isEmpty()||minStack.peek()>=node) // 注意此处的等于号不可以省略
                minStack.push(node);
        }

        /**
         * 判断minStack中是否需要出栈操作
         */
        public void pop() {
            if(stack.peek()==minStack.peek()){
                minStack.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        /**
         * 直接peek minStack
         * @return
         */
        public int min() {
            return minStack.peek();
        }


}
