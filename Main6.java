

        import java.lang.reflect.Array;
        import java.security.Key;
        import java.util.*;


public class Main6 {
    public static int upBound(int[] dp, int len, int in){
        int low = 0;
        int high = len - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = dp[mid];
            if(midVal < in)
                high = mid - 1;
            else if(midVal > in)
                low = mid + 1;
            else
                return mid; // key found
        }
        return high;
    }


    链接：https://www.nowcoder.com/questionTerminal/55371b74b2f243e3820e57ee4c7b5504?answerType=1&f=discussion
    来源：牛客网

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ints = new int[n][2];
        for(int i = 0; i < n; i++){
            ints[i][0] = sc.nextInt();
            ints[i][1] = sc.nextInt();
        }
        Arrays.sort(ints, new Comparator<int[]>() {
            @Override public int compare(int[] o1, int[] o2){
                if(o1[0] != o2[0])
                    return Integer.compare(o2[0], o1[0]);
                else{
                    return Integer.compare(o2[1], o1[1]);
                }
            }
        });
        // dp o(nlogn)
        int[] dp = new int[ints.length + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int len = 0;
        for(int i = 0; i < ints.length; i++){
            if(ints[i][1] <= dp[len]){
                len++;
                dp[len] = ints[i][1];
            }else{
                int temp = upBound(dp, len, ints[i][1]);
                dp[temp + 1] = ints[i][1];
            }
        }
        //System.out.println(Arrays.toString(dp));
        System.out.println(len);
    }
}