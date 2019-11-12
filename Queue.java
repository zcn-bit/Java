import java.util.Stack;
public class Queue {


    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                int top = stack1.pop();
                stack2.push(top);

            }
        }
        int ret = 0;
        if (!stack2.empty()) {
            ret = stack2.pop();

        }
        return ret;
    }
}

