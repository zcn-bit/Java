import java.util.Scanner;
import java.util.Stack;

public class MatchingBracket {
    private static void solution1(String string){
        Stack<Character> stack=new Stack<>();
        char[] arr=string.toCharArray();
        int pairs=0;
        int left=0;
        int right=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                stack.push(arr[i]);
            }
            if(arr[i]==')'){
                if(!stack.empty()){
                    stack.pop();//chuzhan
                    pairs++;
                }else {
                    right++;
                }

            }
        }
        if(!stack.empty()){
            left=stack.size();
        }
        System.out.print(pairs+" ");
        System.out.print(left+" ");
        System.out.print(right);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        solution1(string);
    }
}
