
import java.util.*;

public class Main{//  合唱团

    public static void main(String[] args){

        //获取学生个数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n + 1];
        //获取能力值
        for(int i = 1;i <= n; i++) {
            arr[i] = scanner.nextInt();
        }
        //获取k值
        int k = scanner.nextInt();
        //获取d值
        int d = scanner.nextInt();
        //创建最大值和最小值两个辅助数组，long数组存放数值，范围更大
        long[][] f = new long[n + 1][k + 1];
        long[][] g = new long[n + 1][k + 1];
        //初始化两个数组，即K=1的情况
        for(int i = 1; i <= n; i++) {
            f[i][1] = arr[i];
            g[i][1] = arr[i];
        }
        //从k = 2开始填充（遍历每一行）
        for(int curK = 2; curK <= k; curK++) {
            for(int curN = curK; curN <= n; curN++) {  //遍历每一列
                long tempMax = Long.MIN_VALUE;         //临时最大、最小值变量
                long tempMin = Long.MAX_VALUE;
                //根据left的两个边界条件进行遍历
                for(int left = Math.max(curK - 1, curN - d); left <= curN - 1; left++){
                    //根据所得的递推公式更新最小值 最大值
                    if(tempMax < Math.max(f[left][curK - 1] * arr[curN], g[left][curK - 1] * arr[curN])) {
                        tempMax = Math.max(f[left][curK - 1] * arr[curN], g[left][curK - 1] * arr[curN]);
                    }

                    if(tempMin > Math.min(f[left][curK - 1] * arr[curN], g[left][curK - 1] * arr[curN])) {
                        tempMin = Math.min(f[left][curK - 1] * arr[curN], g[left][curK - 1] * arr[curN]);
                    }
                }
                //更新最大值
                f[curN][curK] = tempMax;
                //更新最小值
                g[curN][curK] = tempMin;
            }
        }
        //确定了K值，要得到最大值，则遍历第K列，即搜索f[curN~n][K]  （curN >= k）
        long maxResult = Long.MIN_VALUE;
        for(int curN = k; curN <= n; curN++) {
            if(f[curN][k] > maxResult)
                maxResult = f[curN][k];
        }
        System.out.println(maxResult);
    }
}

