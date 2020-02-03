
import java.util.*;
public class Which {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0;
        int appleNums[] = new int[n];
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            appleNums[i] = a + input;
            a = appleNums[i];
        }

        int m = scanner.nextInt();
        int searchNums[] = new int[m];
        for (int i = 0; i < m; i++) {
            searchNums[i] = scanner.nextInt();
        }

        //二分查找法
        for (int i = 0; i < m; i++) {
            int index = Arrays.binarySearch(appleNums, searchNums[i]);
            if (index>0) {
                System.out.println(index+1);
            }else{
                System.out.println(-index);
            }
        }
    }}