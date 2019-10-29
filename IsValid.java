import java.util.ArrayList;

public class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);//返回指定索引处的字符【0，length-1】

            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.add(c);
                    break;
                case ')':
                case ']':
                case '}': {
                    if (stack.isEmpty()) {
                        return false;//没有左括号进入
						}
                    char left = stack.remove(stack.size() - 1);//栈顶
                    if (!((left == '(' && c == ')')
                        || (left == '[' && c == ']')
                        || (left == '{' && c == '}'))) {

                        return false;
                    }
                    break;
                }
                default://一直没有返回false，break跳出
                    break;
            }
        }

        if (stack.isEmpty()) {
            return true;//遍历结束，且栈空，
        } else {
            return false;
        }
    }
}
