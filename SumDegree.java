

import java.util.*;
/*
和leetcode188，买卖股票的最佳时机Ⅳ类似
将菜价数组改为每一个位置都是前面所有数字的和就和股价一样
一共能进行M次买卖

1. 使用动态规划
状态量有三种，菜的位置i，能打多少次菜M，是否打这个菜s（0或1）
2. 状态转移方程：
dp[i][M][0]=max(dp[i-1][M][0], dp[i-1][M][1])
解释：
    第i个菜不打能获得的最大值为
    上一个菜不打能获得的最大值
    上一个菜打能获得的最大值
    其中较大的一个
dp[i][M][1]=max(dp[i][M][1]+A[i], dp[i][M-1][0]+A[i])
解释：
    第i个菜打能获得的最大值为
    上一个菜也打获得的最大值加上这个菜的值
    上一个菜不打获得的最大值加上这个菜的值，但是上一个菜的M值要-1，因为这个菜要消耗一次打饭机会

3. 初始值
dp[0][M][0]=0
dp[0][M][1]={    0    ,    M=0
                 A[0] ,    M>0}
4. 简化
简化状态转移方程：
dp_i_0[M]=max(dp_i_0[M], dp_i_1[M])
dp_i_1[M]=max(dp_i_1[M]+A[i], dp_i_0[M-1]+A[i])

简化M的值：
对于任意N个菜，只要M > N/2，就能确保打到所有正数的菜
比如N=2,M只要1
N=3，M只要2
N=4，M只要2

简化A数组
连续的几个正值或者负值可以将其合并为1个值，
比如1，1，-1，-1，2，3
可以简化为2，-2，5
*/
public class SumDegree {

    public static void main(String[] args) {
        // 获取输入
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] A = new int[N];
        int count = 0;
        int sum = 0;
        // 获取数组A并简化
        for (int i = 0; i < N; ++i) {
            int temp = scanner.nextInt();
            // 若sum和A同号，累加
            if ((sum >= 0 && temp >= 0) || (sum <= 0 && temp <= 0)) {
                sum += temp;
            } else {
                // 否则，加入A，重新累计
                A[count] = sum;// 直接在A数组修改就可以
                ++count;
                sum = temp;
            }
        }
        // 最后一个累计加入数组
        A[count] = sum;
        N = count + 1;

        // 若M > (N + 1) / 2，直接将所有正数累加输出
        if (M > (N + 1) / 2) {
            long result = 0;
            for (int a : A) {
                result += (a > 0 ? a : 0);
            }
            System.out.println(result);
            return;
        }

        // 否则进行dp
        long[] dp_i_0 = new long[M + 1];
        long[] dp_i_1 = new long[M + 1];
        for (int m = 1; m <= M; ++m) {
            dp_i_1[m] = A[0];
        }

        for (int i = 1; i < N; ++i) {
            for (int m = 1; m <= M; ++m) {
                dp_i_0[m] = Math.max(dp_i_0[m], dp_i_1[m]);
                dp_i_1[m] = Math.max(dp_i_1[m] + A[i], dp_i_0[m - 1] + A[i]);
            }
        }

        System.out.println(Math.max(dp_i_0[M], dp_i_1[M]));
    }
}
