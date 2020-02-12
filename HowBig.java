
import java.util.Scanner;

public class HowBig {

    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int p = sc.nextInt();
    static int h = sc.nextInt();
    static int w = sc.nextInt();
    static int[] numPerN = new int[n];

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            numPerN[i] = sc.nextInt();
        }
        int l = 1;
        int r = Math.min(h, w);//字号最大为行宽和列高中较小的一个
        while (l + 1 < r) {
            int mid = l + (r - l) / 2;
            if (isOk(mid)) {
                l = mid;
            } else {
                r = mid;
            }
        }
        if (isOk(r)) {
            System.out.println(r);
        } else {
            System.out.println(l);
        }
    }

    public static boolean isOk(int size) {
        int totalHang = 0;// 一共有多少行
        int preHang = w / size;// 每行有多少字
        for (int i = 0; i < n; i++) {
            int temp = numPerN[i] / preHang;// 每一段要多少行
            if (numPerN[i] % preHang != 0) {
                temp++;
            }
            totalHang += temp;
        }
        int perYe = h / size;// 每一页有多少行
        int totalYe = totalHang / perYe;// 一共有多少页
        if (totalHang % perYe != 0) {
            totalYe++;
        }
        if (totalYe <= p) {
            return true;
        } else {
            return false;
        }
    }
}