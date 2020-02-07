import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bonus {



    /**
     * 双指针思想:
     * 左右指针遍历数组找左边数组的和和右边数组的和比较来移动指针
     * 1.相等则保存当前值，左指针右移，右指针左移动
     * 2.左边和 > 右边和  右指针左移
     * 3.左边和 < 右边和  左指针右移
     */


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] line2 = bf.readLine().split(" ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(line2[i]);
        }
        int left = 0, right = n - 1;
        long left_sum = nums[left], right_sum = nums[right], max_sum = 0;
        while (left < right) {
            if (left_sum == right_sum){
                max_sum = left_sum;
                left_sum += nums[++left];
                right_sum += nums[--right];
            }else if (left_sum > right_sum){
                right_sum += nums[--right];
            }else {
                left_sum += nums[++left];
            }
        }
        System.out.println(max_sum);
    }
}