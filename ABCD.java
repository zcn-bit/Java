import java.util.Scanner;

public class ABCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();

        int n2 = in.nextInt();

        int n3 = in.nextInt();
        int n4 = in.nextInt();
        //怎么确定输入N的范围？ 输入测试用例的要求。不用管  ABC 初始化后赋值问题？ 赋值符合正确否则no  题目说明输出要去
        int A = 0;
        int B = 0;
        int C = 0;
        if ((A == (n1 + n3) / 2) && (B == (n2 + n4) / 2) && (C == (n4 - n2) / 2)) {
            System.out.print(A + " " + B + " " + C);
        } else {
            System.out.println("NO");
        }

    }
}
