import java.util.Scanner;

public class TransformOfDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(Integer.parseInt(sc.next().replaceAll("x", ""), 16));
        }
    }
}