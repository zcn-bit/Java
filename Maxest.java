
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;
public class Maxest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(",");
        int len = split.length; int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        int cnt = 1; int sum = 0;
        StringBuilder sb = new StringBuilder();
        while (cnt <= len) {
            for (int i = 0; i < len; i = i + cnt) {
                for (int j = i; j < i + cnt && i + cnt <= len; j++) {
                    sum = sum + arr[j];
                }
                sb.append(sum).append(" ");sum = 0;
            }
            cnt++;
        }
        String[] split1 = sb.toString().split(" ");
        int[] arr1 = new int[split1.length];
        for (int i = 0; i < split1.length; i++) {
            arr1[i] = Integer.parseInt(split1[i]);
        }
        Arrays.sort(arr1);
        if (arr1[arr1.length - 1] > 0) {
            System.out.print(arr1[arr1.length - 1]);
        } else {
            System.out.print(0);
        }
    }
}