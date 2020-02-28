
 import java.util.Scanner;
import static java.lang.System.in;
public class Methed {
public static void main(String[] args) {
        Scanner sc = new Scanner(in);
         int n = sc.nextInt();
        int f1 = 1, f2 = 1;
         int temp = 0;
         for (int i = 2; i <=n; i++) {
             temp = f1 + f2;
            f1 = f2;
             f2 = temp;
             }
         System.out.println(f2);
         }
}
