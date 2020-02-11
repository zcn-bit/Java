
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;

public class Sort {

    /**
     * 每次把后6位数字切出来丢进数组，之后排序
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            ans[i] = Integer.parseInt(s.substring(s.length()-6,s.length()));
        }
        Arrays.sort(ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}