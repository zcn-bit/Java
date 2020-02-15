
import java.io.*;
        import java.util.*;
public class PlalindromeSum{
    static int count = 0;
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i = 0 ; i < str.length(); i++){
            center(str,i,i);
            center(str,i,i+1);
        }
        System.out.println(count);
    }
    private static void center(String s,int left,int right){
        while(left>=0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            count++;
        }
    }
}