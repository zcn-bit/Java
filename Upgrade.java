import java.util.Scanner;

public class Upgrade {
public static int max(int a,int b) {


    int p = a;
    int q =b;
    while (q != 0) {

        int t = p % q;
        p = q;
        q = t;
    }//p
    return p;
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            int start = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {//遍历每个怪物
                arr[i] = in.nextInt();

            }
            for (int i = 0; i < n; i++) {
                if (arr[i] <= start) {//打败
                    start = start + arr[i];

                }
                if (arr[i] > start) {
                    //qiu最大公约数
                    int tmp = max(arr[i], start);
                    start = start + tmp;


                }


            }

            System.out.println(start);
        }
    }
}
