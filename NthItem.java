
import java.util.*;
public class NthItem {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= n; i++) {
            if ((1 + i) * i / 2 >= n) {
                System.out.println(i);
                break;
            }
        }

    }
}