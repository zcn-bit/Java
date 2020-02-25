import java.util.Scanner;
import static java.lang.System.in;

public class SpeedK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String[] str = sc.nextLine().split(" ");
        int h = Integer.parseInt(sc.nextLine());
        int[] data = new int[str.length];
        int maxSpeed = Integer.MIN_VALUE;
        for (int i = 0; i < str.length; i++) {
            data[i] = Integer.parseInt(str[i]);
            maxSpeed = Math.max(maxSpeed, data[i]);
        }
        int mid = 0;
        int minSpeed = 1;
        while (minSpeed <= maxSpeed) {
            mid = minSpeed + ((maxSpeed - minSpeed) >> 1);
            if (getHour(data, mid) <= h) {
                maxSpeed = mid - 1;
            } else {
                minSpeed = mid + 1;
            }
        }
        System.out.println(minSpeed);
    }

    public static int getHour(int[] data, int k) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i] % k == 0 ? data[i] / k : data[i] / k + 1;
        }
        return sum;
    }
}