
import java.util.Scanner;

/**
 * 字符串反转
 * 题目描述
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 * 输入描述:
 * 输入N个字符
 * 输出描述:
 * 输出该字符串反转后的字符串
 * 示例1
 * 输入abcd
 * 输出dcba
 */
public class ReverseOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str= scanner.nextLine();
            //将字符串变成char数组再倒序输出
            char[] chars= str.toCharArray();
            for(int i=chars.length-1;i>=0;i--){
                System.out.print(chars[i]);
            }
            System.out.println();
        }
    }
}
