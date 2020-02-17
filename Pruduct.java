
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Pruduct {


    /**
     * 本来想着这种暴力方***超时，因为是在没想到好的方法....
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        str = str.substring(1,str.length()-1);//数据处理，去掉[ 和 ]括号
        str = str.replace("\"","");//去掉 ",注意用转移符\"
        String[] dic = str.split(",");
        int max_leng = 0;
        for (int i = 0; i < dic.length; i++) {
            for (int j = i+1; j < dic.length; j++) {
                if (noContain(dic[i], dic[j])) {
                    max_leng = Math.max(max_leng, dic[i].length() * dic[j].length());
                }
            }
        }
        System.out.println(max_leng);
    }

    //判断两个字符是否重复，只能每个字符每个字符的比较了
    private static boolean noContain(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains(s1.substring(i, i + 1))) {
                return false;
            }
        }
        return true;
    }
}