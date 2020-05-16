

        import java.util.Scanner;
        import static java.lang.System.in;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        temp = new int[n];
        mergeWay(data, 0, n - 1);
        System.out.println(count);
    }
    public static void mergeWay(int[] data, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int mid = begin + ((end - begin) >> 1);
        mergeWay(data,begin,mid);
        mergeWay(data,mid+1,end);
        merge(data, begin, end, mid);
    }
    public static int[] temp;
    public static int count = 0;
    private static void merge(int[] data, int begin, int end, int mid) {
        int i = begin, j = mid + 1;
        int k = i;
        while (i <= mid && j <= end) {
            count += data[i] <= data[j] ? 0 : mid - i + 1;//这里加的逆序对是这么多，而不是加1
            temp[k++] = data[i] <= data[j] ? data[i++] : data[j++]; //先写上面，这里i，j已变化
        }
        while (i <= mid) {
            temp[k++] = data[i++];
        }
        while (j <= end) {
            temp[k++] = data[j++];
        }
        for (int h = begin; h < k; h++) {
            data[h] = temp[h];
        }
    }
}