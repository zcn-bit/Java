
/*
26个字母轮流***去。
原字符串中有几个字符和插入字符一样，就会有几个插入效果相同，所以要减去。
*/
import java.util.*;
public class Kinds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        int ans = 0;
        int cnt = 0;
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 26; i++) {
            cnt = 0;
            for (int j = 0; j < len; j++) {
                if (tmp.charAt(i) == s.charAt(j))
                    cnt++;
            }
            ans += len + 1 - cnt;
        }
        System.out.println(ans);
    }
}
