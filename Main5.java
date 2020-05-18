import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int W = sc.nextInt();
        ArrayList<Integer> ai = new ArrayList<>();//保存结束时的点数
        ArrayList<Double> ai2 = new ArrayList<>();//保存相应点数出现的概率
        getWay(K, W, ai, 0, ai2, 1);
        double c = 0;
        Iterator<Integer> it = ai.iterator();
        Iterator<Double> it2 = ai2.iterator();
        while (it.hasNext()) {
            if (it.next() <= N)
                c += it2.next();
            else
                it2.next();
        }
        System.out.println(String.format("%.5f", c));
    }

    private static void getWay(int k, int m, ArrayList<Integer> ai, int count, ArrayList<Double> ai2, double num) {
        if (count >= k) {
            ai.add(count);
            ai2.add(num);
            return;
        }
        for (int i = 1; i <= m; i++) {
            getWay(k, m, ai, count + i, ai2, num / m);
        }
    }
}