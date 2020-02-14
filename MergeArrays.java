
/*
        动态规划。
        每次比较当前两个数组中最小的元素，更小的放入答案数组中。
        细节处理：
        要处理只有一行输入的情况。否则会卡80%，非法访问。
        */
        import java.util.*;
public class MergeArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        if (!in.hasNext()) {
            System.out.println(s1);
            return;
        }
        String s2 = in.nextLine();
        String[] str1 = s1.split(",");
        String[] str2 = s2.split(",");
        int len1 = str1.length;
        int len2 = str2.length;
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        for (int i = 0; i < len1; i++) {
            arr1[i] = Integer.parseInt(str1[i]);
        }
        for (int i = 0; i < len2; i++) {
            arr2[i] = Integer.parseInt(str2[i]);
        }
        int[] ans = new int[len1 + len2];
        int loc1 = 0;
        int loc2 = 0;
        int loc = 0;
        for (loc = 0; loc < len1 + len2; loc++) {
            if (loc1 ==len1) {
                ans[loc] = arr2[loc2];
                loc2++;
            } else if (loc2 == len2) {
                ans[loc] = arr1[loc1];
                loc1++;
            } else if (arr1[loc1] < arr2[loc2]) {
                ans[loc] = arr1[loc1];
                loc1++;
            } else {
                ans[loc] = arr2[loc2];
                loc2++;
            }
        }
        for (int i = 0; i < len1 + len2 - 1; i++) {
            System.out.print(ans[i] + ",");
        }
        System.out.println(ans[len1 + len2 - 1]);
    }
}