import javax.management.monitor.StringMonitorMBean;
import java.util.ArrayList;
import java.util.List;

public class NoneRepeatCharLength {

        public static void main(String[] args) {
            String s = "aabaab!bb";
            int i = lengthOfLongestSubstring(s);
            System.out.println(i);
        }

        public static int lengthOfLongestSubstring(String s) {
            // 进行非空校验
            if (s == null || "".equals(s)) {
                return 0;
            }

            // 用于保存每个串的长度
            List<Integer> allLength = new ArrayList<>();
            // 可变字符串,存储串数据
            StringBuilder sb = new StringBuilder("");
            // 将给定的串转换成字符数组,进行比对
            for (char c : s.toCharArray()) {
                // 若该串中存在当前字符,则该串已达到最大长度
                if (sb.toString().contains(String.valueOf(c))) {
                    // 记录当前串的长度
                    allLength.add(sb.length());
                    // 构建新串,从当前重复字符的下一个位置开始,到字符串结尾,再加上当前字符,构成一个新串,继续循环
                    sb = new StringBuilder(sb.substring(sb.indexOf(String.valueOf(c)) + 1, sb.length()))  .append(c);
                    // 若该串中不存在当前字符,则追加
                } else {
                    sb.append(String.valueOf(c));
                }
            }
            // 最后添加一次串的长度
            allLength.add(sb.length());//????????? 如果后几次全都无重复字母，那么没机会走到if中，得不到最后一个字串的长度
            // 定义串的最大长度
            int max = 0;
            // 循环长度集合,找出最大值
            for (int i : allLength) {
                if (i > max) {
                    max = i;
                }
            }

            return max;
        }

    }


