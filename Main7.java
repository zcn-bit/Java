

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

/**
 * 只要 sum 比 target 大，而且差值为偶数就可以了；
 * 假设a为正向移动步数，b为负向移动步数，有 a - b = target，sum = a+b；
 * 则有 sum - target == 2b;故sum与b成正比
 * 一定是可以走到的：因为 反一步+ 正一步 步长加一
 */
public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int sum = 0;
        int step = 1;
        while (n > sum || (sum - n) % 2 != 0) {
            sum += step;
            step++;
        }
        System.out.println(step - 1);
    }
}