
import java.util.Scanner;

/**
 * 题目描述
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 输入描述:
 * 输入一个int型整数
 * 输出描述:
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 *
 * 示例1
 * 输入
 * 9876673
 * 输出
 * 37689
 */
public class DrawNotRepeatNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char[] chars= (num+"").toCharArray();
        String str ="";
        for(int i= chars.length-1; i>= 0;i--){
            if(!str.contains(chars[i]+"")){
                str +=chars[i];
            }
        }
        System.out.println(Integer.valueOf(str));
    }
}
