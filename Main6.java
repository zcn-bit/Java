import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

;import static java.util.Arrays.sort;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i ++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> e1[1] - e2[1]);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(arr[0][1] - 1);
        list.add(arr[0][1]);
        for(int i = 1; i < n; i ++) {
            if(arr[i][0] > list.peekLast()) { // 相离
                list.add(arr[i][1] - 1);
                list.add(arr[i][1]);
            } else if(arr[i][0] > list.get(list.size() - 2)) {
                list.add(arr[i][1]);
            }
        }

        System.out.println(list.size());
    }
}