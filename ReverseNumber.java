
import java.util.Scanner;
//整数--》字符串形式
public class ReverseNumber {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        String res = "";//如果是“ ”。会在数字前加空格
        while (number != 0) {
int last=number%10;
int remaining=number/10;
     // res.concat(String.valueOf(last));
res=res+String.valueOf(last);
number=remaining;
        }
        System.out.println(res);

    }
}
