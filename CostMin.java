
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class CostMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(",");
        br.close();

        int[] arr = new int[tmp.length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(tmp[i]);

        int[] rec = new int[arr.length+1];
        rec[2] = Math.min(arr[0], arr[1]);
        for(int i = 3; i < rec.length; i++)
            rec[i] = Math.min(rec[i-2] + arr[i-2], rec[i-1] + arr[i-1]);
        System.out.println(rec[arr.length]);
    }
}