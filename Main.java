
import java.util.*;
//贪心算法求解：1.当遇到第一个'.'时，表示该位置需要被照亮，此时不安装路灯，在它的下一个位置安装路灯，即sum+1;
//因为该路灯位置的下一个位置已经被照亮了，因此下标+2
//遇到‘X’时跳过，因为不需要安装
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            String s = sc.next();
            int sum = 0;
            for(int j = 0; j < n; j++){
                if(s.charAt(j) == '.'){
                    sum++;
                    j = j + 2;
                }
            }
            System.out.println(sum);
        }
    }
}