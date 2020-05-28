

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    private static boolean match(String matchStr, String str, int matchIdx, int idx) {
        if (matchIdx == matchStr.length() && idx == str.length()) {
            return true;
        }
        if (idx >= str.length() && matchIdx < matchStr.length() && matchStr.charAt(matchIdx) == '*') {
            return match(matchStr, str, matchIdx + 1, idx);
        }
        if (matchIdx >= matchStr.length() || idx >= str.length()) {
            return false;
        }
        if (matchStr.charAt(matchIdx) != '*' && matchStr.charAt(matchIdx) != str.charAt(idx)) {
            return false;
        }
        boolean flag = false;
        if (matchStr.charAt(matchIdx) == '*') {
            flag = match(matchStr, str, matchIdx + 1, idx) || match(matchStr, str, matchIdx, idx + 1);
        }
        if (matchStr.charAt(matchIdx) == str.charAt(idx)) {
            flag |= match(matchStr, str, matchIdx + 1, idx + 1);
        }
        return flag;
    }

    private static List<Integer[]> getMatchPosAndLen(String matchStr, String str) {
        List<Integer[]> ans = new ArrayList<>();
        for (int i = 0; i < str.length(); ++i) {
            if (matchStr.charAt(0) != '*' && matchStr.charAt(0) != str.charAt(i)) {
                continue;
            }
            for (int j = i; j < str.length(); ++j) {
                if (matchStr.charAt(matchStr.length() - 1) != '*' && matchStr.charAt(matchStr.length() - 1) != str.charAt(j)) {
                    continue;
                }
                if (match(matchStr, str.substring(i, j + 1), 0, 0)) {
                    ans.add(new Integer[]{i, j - i + 1});
                }
            }
        }
        if (ans.size() == 0) {
            ans.add(new Integer[]{-1, 0});
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        List<Integer[]> list = getMatchPosAndLen(matchStr, str);
        for (Integer[] arr : list) {
            System.out.println(arr[0] + " " + arr[1]);
        }

    }
}
