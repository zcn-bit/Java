

 import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
    public class Main{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                char[] c = in.next().toCharArray();
                StringBuffer sb = new StringBuffer();
                Set<Character> set = new HashSet<Character>();
                for(int i = 0;i<c.length;i++){
                    if(set.add(c[i]))//很巧妙
                        sb.append(c[i]);
                }
                System.out.println(sb.toString());
            }
        }
    }