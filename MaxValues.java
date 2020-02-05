import java.util.Scanner;
import java.util.*;
    public class MaxValues {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] d = new int[4];
            d[0] = a + b + c;
            d[1] = (a + b) * c;
            d[2] = a + (b + c);
            d[3] = a * b * c;
            Arrays.sort(d);
            System.out.println(d[3]);//组成的最大值
        }
    }
