public class Solution {

    public boolean match(char[] str, char[] pattern) {
        if(str == null || pattern == null) {
            return false;
        }
        return matchCore(str, 0, pattern, 0);
    }

    private boolean matchCore(char[] cs, int csIndex, char[] pattern, int patternIndex) {
        // 匹配结束，cs和pattern同时结束
        if(csIndex == cs.length && patternIndex == pattern.length) {
            return true;
        }
        // 匹配结束，cs比pattern先结束
        if(csIndex != cs.length && patternIndex == pattern.length) {
            return false;
        }
        // 如果第二个字符是*，判断第一个字符是否相同，若相同，分3种情况
        // 如果不同，模式跳过两个字符
        if(patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            if ((csIndex != cs.length && pattern[patternIndex] == cs[csIndex])
                    || pattern[patternIndex] == '.' && csIndex != cs.length) {
                return matchCore(cs, csIndex + 1, pattern, patternIndex + 2) // 跳转到下一个状态
                        || matchCore(cs, csIndex + 1, pattern, patternIndex) // 保持当前状态，继续匹配
                        || matchCore(cs, csIndex, pattern, patternIndex + 2);// 忽略*
            } else {
                return matchCore(cs, csIndex, pattern, patternIndex + 2); // 忽略*
            }
        }

        if(csIndex != cs.length && (cs[csIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')) {
            return matchCore(cs, csIndex+1, pattern, patternIndex+1);
        }
        return false;
    }
}
