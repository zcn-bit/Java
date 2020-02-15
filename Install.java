
import java.util.Scanner;

public class Install {

    static int temp = 0;
    public static void dfs(int count, int rest) {
        if (rest < 0) {//如果-3，-5或者-7小于0了，说明凑不齐，赶紧溜了
            return;
        }
        if (rest == 0) {
            System.out.println(temp*15+count);
            System.exit(0);
        }
        dfs(count + 1, rest - 7);
        dfs(count + 1, rest - 5);
        dfs(count + 1, rest - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        temp = n / 105;
        dfs(0, n % 105);
        System.out.println(-1);
    }
}