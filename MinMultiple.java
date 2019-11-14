import java.util.*;
//数的范围的确定
public class MinMultiple {
    public static void main(String[] args) {
//当最小公倍数的范围不能确定时，可能不需要知道范围，从输入找依据

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int mutiply = A * B;
        if (B == 0) {
            System.out.println(A);
        }
        while(B != 0) {//B是除数，做分母int mutiply = A * B;
            int yushu = A % B;
            A = B;
            B = yushu;
        }


                int result = mutiply / A;
            System.out.println(result);
        }
    }







