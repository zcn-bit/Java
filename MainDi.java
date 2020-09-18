import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDi {
    private  static void solution(int n, String string){//子串长度n
        int num=string.length()/n;//块个数

        if(string.length()%n!=0){
            num=num+1;
        }
        String[] arr=new String[num];
        int j=0;
        for (int i=0;i<string.length();i=i+n){
         arr[j]  = string.substring(i,i+n);
           // i=i+n;
            j=j+1;
        }
        String str[]=new String[arr.length];
        int y=0;
        for(int m=0;m<arr.length;m++){
            StringBuffer sb=new StringBuffer(arr[m]);
           str[y++]=sb.reverse().toString();
        }
  for(int w=0;w<str.length;w++){
      System.out.print(str[w]);
  }
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=scanner.nextLine();
        //System.out.println(solution(n, s));
        solution(n, s);
    }
}
