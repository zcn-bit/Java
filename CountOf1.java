
import java.util.*;
public class CountOf1 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        // 循环 1->n
        for(int i=1;i<=n;i++){
            count += f(i);
        }
        return count;
    }
    // 判断有多少个1
    public int f(int n){
        String str = n+"";
        char[] c = str.toCharArray();
        int count = 0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='1'){
                count++;
            }
        }
        return count;
    }
}