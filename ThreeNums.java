import java.util.*;

public class ThreeNums {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);//数组升序排列
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {//0到倒数第三个数
            int j = i + 1;//【1，倒数第二】
            int k = nums.length - 1;//倒数第一个数
            while (j < k) {//J没有越界  i一定没越
                while (j < k && nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }
                if (j >= k) {
                    break;
                }
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> e = new ArrayList<>();
                    e.add(nums[i]);
                    e.add(nums[j]);
                    e.add(nums[k]);
                    result.add(e);
                    while (j < k && nums[j] == nums[j + 1]) {//去掉重复的
                        j++;
                    }
                    j++;//最后一个相同数，再++，变成别的数
                }

                while (j < k && nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                }
                if (j >= k) {
                    break;
                }
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> e = new ArrayList<>();
                    e.add(nums[i]);
                    e.add(nums[j]);
                    e.add(nums[k]);
                    result.add(e);
                    while (j < k && nums[k] == nums[k - 1]) {//与上面同理
                        k--;
                    }
                    k--;
                }
            } 

            while (i < nums.length - 2 && nums[i] == nums[i+1]) {//i控制最大循坏
                i++;//for循坏i++，变成下一个不同的数，
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }
}
