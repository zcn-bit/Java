import java.util.*;
public class CakeCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();
        int[][] arr = new int[W][H];//数组初始化全为0
        int count = 0;
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                if (arr[i][j] == 0) {//数组初始化全为0   0可以  -1就往后循坏
                    count++;//刚开始可以放蛋糕   横纵隔一行就不能放并标记为-1
                    if (i + 2 < W) {//保证不能越界
                        arr[i + 2][j] = -1;
                    }
                    if (j + 2 < H) {//保证不能越界
                        arr[i][j + 2] = -1;
                    }
                }

            }
        }
        System.out.println(count);
    }
}
