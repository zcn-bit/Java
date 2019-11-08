import java.util.Scanner;
public class Plindrome {


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            String b = sc.nextLine();
            int count = 0;
            if(isPlindrome(b+a,0,b.length()+a.length()-1)){
                count++;//string     [left,right]
            }
            for(int i = 1;i<a.length();i++){
                if(isPlindrome(a.substring(0,i)+b+a.substring(i),0,b.length()+a.length()-1)){
                    count++;
                }
            }
            if(isPlindrome(a+b,0,b.length()+a.length()-1)){
                count++;
            }
            System.out.println(count);
        }

        public static boolean isPlindrome(String s,int i,int j){
            //判断是否为回文
            while(i<=j){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }


}
