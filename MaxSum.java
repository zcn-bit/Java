import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();

            }

            int[] dp = new int[n];
            dp[0] = arr[0];
            for (int i = 1; i < n; i++) {
                dp[i] = Math.max(arr[i] + dp[i - 1], arr[i]);
            }//重新构建一个数组，数组元素要么是原来的元素，要么该原来位置元素再把之前的累加上（其实它的前一个元素也可能是累加而来的）
           //每次保存都是相对而言比较大的
            int ret = dp[0];
            for (int i = 1; i < n; i++) {
                ret = Math.max(ret, dp[i]);
            }
            System.out.println(ret);
        }
    }
}
