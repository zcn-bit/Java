
import java.util.Scanner;

public class Number {

    public static long result = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long total = scanner.nextLong();
        long[] base = new long[n];
        for (int i = 0; i < base.length; i++) {
            base[i] = scanner.nextLong();
        }
        dfs(base, 0, total, 0);
        System.out.println(result);

    }

    public static void dfs(long[] base, int index, long total, long current) {
        if(index == base.length) {
            return;
        }
        if(current + base[index] <= total) {
            result++;
            dfs(base, index + 1, total, current  + base[index]);
        }
        dfs(base, index + 1, total, current);
    }
}