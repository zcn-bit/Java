
        import java.util.Scanner;

/**
 * Created by SeanSeanSean on 2018/8/17.
 * 商汤科技
 * 最小区间
 * 直接最笨的方法，每次把最小的那个数往前推一个，计算相差值，若比之前小进行记录。
 */
public class Main7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[][] array = new int[k][n];
            for (int i = 0; i < k; i++){
                for (int j = 0; j < n; j++){
                    array[i][j] = sc.nextInt();
                }
            }
            int[] loc = new int[k];
            int[] val = new int[k];
            for (int i = 0; i < k; i++){
                loc[i] = 0;
                val[i] = array[i][loc[i]];
            }
            int temp = Integer.MAX_VALUE;
            int down = 0;
            int up = 0;

            while (true){
                int max_val = Integer.MIN_VALUE;
                int min_val = Integer.MAX_VALUE;
                int max_loc = -1;
                int min_loc = -1;
                for (int i = 0; i < k; i++){
                    if(val[i] > max_val) {
                        max_val = val[i];
                        max_loc = i;
                    }
                    if(val[i] < min_val){
                        min_val = val[i];
                        min_loc = i;
                    }
                }
                if(max_val - min_val < temp){
                    down = min_val;
                    up = max_val;
                    temp = max_val-min_val;
                }
                loc[min_loc]++;
                if (loc[min_loc] == n){
                    break;
                }
                else
                    val[min_loc] = array[min_loc][loc[min_loc]];
            }
            System.out.println(down + " " + up);
        }
    }
}