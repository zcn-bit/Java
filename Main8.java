
        import java.util.*;
public class Main8 {
    public static class State {
        long money;
        int deal;
        public State(long money, int deal) {
            this.money = money;
            this.deal = deal;
        }
        public State(State h) {
            this.money = h.money;
            this.deal = h.deal;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }
            State[][] dp = new State[n][2];
            dp[0][0] = new State(0, 0);
            dp[0][1] = new State(-a[0], 1);
            for (int i = 1; i < n; ++i) {
                State sell = new State(dp[i - 1][1]);
                sell.money += a[i];
                sell.deal += 1;
                dp[i][0] = max(sell, dp[i - 1][0]);

                State buy = new State(dp[i - 1][0]);
                buy.money -= a[i];
                buy.deal += 1;
                dp[i][1] = max(dp[i - 1][1], buy);
            }
            System.out.println(dp[n - 1][0].money + " " + dp[n - 1][0].deal);
        }
    }
    public static State max(State h1, State h2) {
        if (h1.money != h2.money) {
            return h1.money > h2.money ? h1 : h2;
        }
        else {
            return h1.deal <= h2.deal ? h1 : h2;
        }
    }
}