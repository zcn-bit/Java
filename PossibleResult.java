import java.util.Stack;

public class PossibleResult {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            Stack<Integer> stack = new Stack<Integer>();

            int j = 0;
            for (int i = 0; i<pushA.length;i++){
                stack.push(pushA[i]);
                while (!stack.empty()&&stack.peek()==popA[j]){
                    stack.pop();
                    j++;
                }
            }
            return stack.empty();
        }

}
