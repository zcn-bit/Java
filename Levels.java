
import java.util.Arrays;
        import java.util.Scanner;
//22
public class Levels {

    /*
     * 题目描述 小明有一袋子长方形的积木，如果一个积木A的长和宽都不大于另外一个积木B的长和宽，则积木A可以搭在积木B的上面。
     * 好奇的小明特别想知道这一袋子积木最多可以搭多少层，你能帮他想想办法吗？ 定义每一个长方形的长L和宽W都为正整数，并且1 <= W <= L <=
     * INT_MAX, 袋子里面长方形的个数为N, 并且 1 <= N <= 1000000. 假如袋子里共有5个积木分别为 (2, 2), (2,
     * 4), (3, 3), (2, 5), (4, 5), 则不难判断这些积木最多可以搭成4层, 因为(2, 2) < (2, 4) < (2, 5)
     * < (4, 5)。 输入描述: 第一行为积木的总个数 N
     *
     * 之后一共有N行，分别对应于每一个积木的宽W和长L 输出描述: 输出总共可以搭的层数
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Size[] sizes = new Size[n];
        for (int i = 0; i < n; i++) {
            Size s = new Size(sc.nextInt(), sc.nextInt());
            sizes[i] = s;
        }
        // 按照宽升序
        Arrays.sort(sizes);
        int[] dp = new int[n];
        int tip = 0;// 层数
        for (int i = 0; i < n; i++) {
            if (tip == 0 || sizes[i].l >= dp[tip - 1]) {
                dp[tip++] = sizes[i].l;
            } else {
                int index = find(dp, 0, tip, sizes[i].l);
                dp[index] = sizes[i].l;
            }
        }
        System.out.println(tip);
    }

    public static int find(int[] dp,int left, int right, int target) {
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (dp[mid] >= target)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}

  class Size implements Comparable<Size> {
    int l;
    int w;

    public Size(int w, int l) {
        this.w = w;
        this.l = l;
    }

    @Override

    public int compareTo(Size o) {
        if (w >= o.w) {
            return 1;
        } else {
            return -1;
        }
    }
}