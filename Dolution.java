import java.util.Scanner;

public class Dolution {




        private static String getString(int number) {
            StringBuilder s = new StringBuilder();
            while (number != 0) {
                s.append(number % 10);
                number /= 10;
            }
            return s.toString();
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            String result = getString(number);
            System.out.println(result);
        }
    }
