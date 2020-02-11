
import java.util.*;
public class Maxlength {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while(in.hasNextLine()){
            String s =in.nextLine();
            int n = s.length();
            int[][] dp = new int[n+1][n+1];//dp[l][r]表示l-r中的最长回文串
            for (int r = 1; r <=n; r++) {
                dp[r][r] = 1;
                for (int l = r - 1; l > 0; l--) {
                    if (s.charAt(l-1) == s.charAt(r-1)) {
                        dp[l][r] = dp[l + 1][r - 1] + 2;
                    }else {
                        dp[l][r] = Math.max(dp[l+1][r],dp[l][r-1]);
                    }
                }
            }
            System.out.println(dp[1][n]);
        }
    }
}