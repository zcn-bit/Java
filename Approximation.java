
import java.util.Scanner;

public class Approximation{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //输入参数
        double a = in.nextDouble();
        //取整数部分
        int b = (int)a;
        //判断
        if((a - b) >= 0.5){
            b=(int)(a + 0.5);
        }
        System.out.println(b);
    }
}