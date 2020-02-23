
import java.util.*;

public class ProfitMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buy = scanner.nextInt(), profit = 0;
        while (scanner.hasNext()) {
            // 输入新的价格
            int price = scanner.nextInt();
            // 每次输入新的价格时，更新最大利润
            profit = Math.max(profit, price - buy);
            // 每次输入新的价格时，更新最低买入价
            buy = Math.min(buy, price);
        }
        System.out.println(profit);
    }
}