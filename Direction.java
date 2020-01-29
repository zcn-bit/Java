

import java.util.Scanner;

public class Direction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] direction = new char[] {'E', 'S', 'W', 'N', 'E', 'S', 'W'};
        int n = sc.nextInt();
        String path = sc.next();
        int countLeft = 0;
        int countRight = 0;
        for (int i = 0; i < n; i++) {
            if (path.charAt(i) == 'L') {
                countLeft++;
            } else {
                countRight++;
            }
        }
        countLeft %= 4;
        countRight %= 4;
        System.out.println(direction[3 + (countRight - countLeft)]);
    }
}