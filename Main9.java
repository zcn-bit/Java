

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.HashSet;



public class Main9 {

    //还是python大法好啊，十几行....
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine().trim().split("\"")[1];
        String[] split = bf.readLine().trim().split("\"");
        HashSet<String> dic = new HashSet<>();
        for (int i = 0; i < split.length; i++) {
            if (i % 2 != 0) {
                dic.add(split[i]);
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        backtrack(dic, new StringBuilder(), s, ans);
        //下面就是字符串的拼接了..........
        if (ans.size() == 0){
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < ans.size() - 1; i++){
            String s1 = ans.get(i);
            sb.append(s1.substring(0,s1.length()-1)).append(',').append(" ");
        }
        String s2 = ans.get(ans.size()-1);
        sb.append(s2.substring(0,s2.length()-1)).append(']');
        System.out.println(sb.toString());
    }

    //很标准的回溯算法
    private static void backtrack(HashSet<String> dic, StringBuilder sb, String s, ArrayList<String> list) {
        if (s.isEmpty()) {
            list.add(sb.toString());
            sb.delete(0, sb.length());//组合成功记得清零
            return;
        }
        for (String item : dic) {
            if (s.startsWith(item)) {
                backtrack(dic, sb.append(item).append(" "), s.substring(item.length()), list);
            }
        }
    }
}