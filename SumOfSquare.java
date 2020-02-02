 /*
无论何种情况，重叠区域也是四条边组成。
而且是取自与n的矩形中的四条。
所以遍历边的交点即可。
*/
import java.util.*;

 public class SumOfSquare {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] x1 = new int[n];
            int[] y1 = new int[n];
            int[] x2 = new int[n];
            int[] y2 = new int[n];
            int xmin = Integer.MAX_VALUE;
            int xmax = Integer.MIN_VALUE;
            int ymin = Integer.MAX_VALUE;
            int ymax = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++)
                x1[i] = in.nextInt();
            for (int i = 0; i < n; i++)
                y1[i] = in.nextInt();
            for (int i = 0; i < n; i++)
                x2[i] = in.nextInt();
            for (int i = 0; i < n; i++)
                y2[i] = in.nextInt();
            int ans = 0;
            int cnt = 0;
            for (int x : x1)
                for (int y : y1) {
                    for (int i = 0; i < n; i++) {
                        if (x >= x1[i] && x < x2[i] && y >= y1[i] && y < y2[i])
                            cnt++;
                    }
                    if (cnt > ans)
                        ans = cnt;
                    cnt = 0;
                }
            System.out.println(ans);
        }
    }

