
import java.util.*;
public class Main9192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String [] arr = new String[n];
            for(int i=0;i<n;i++){
                String str = sc.next();
                arr[i] = str;
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}