import java.util.Scanner;

public class Compress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] str = s.toCharArray();
        int len = s.length();
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            cnt++;
            if (i == len - 1 || str[i] != str[i + 1]) {
                System.out.print(cnt + "" + str[i]);
                cnt = 0;
            }
        }
    }
}
