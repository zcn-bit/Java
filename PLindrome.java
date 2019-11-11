import java.util.Scanner;

public class PLindrome {

    public static boolean isHuiWen(String s){
       int i=0;
       int j=s.length()-1;
       while(i<j){
           if(s.charAt(i)!=s.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
       return true;
    }

    public static void main(String[] args) {
        int count=0;
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();

        for(int i=0;i<str1.length();i++){
            StringBuilder sb=new StringBuilder(str1);//插入一个位置后，sb局部变量，每次是一个新的值
            sb.insert(i,str2);
            if(isHuiWen(sb.toString())){
                count++;
            }

        }
        System.out.println(count);
    }
}
