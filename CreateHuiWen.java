import java.util.Scanner;

public class CreateHuiWen {
    private static  int  Solution2(String string){
  char[] arr=string.toCharArray();
  //有几个奇数长就有几个子串
        int cnt=1;
        int index=0;
        int [] t=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            index=arr[i]-'a';
            t[index]++;
        }
        //
        for(int i=0;i<t.length;i++){
            if((t[i]&1)==1){//是奇数
                t[i]--;//拿一个作为第一个回文串的中心
                break;//找第一个即可
            }
        }

        for(int i=0;i<t.length;i++){//剩下的两两放在两边。还有奇数个，只能单独成家
            if(t[i]%2==1){//是奇数
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String string=scanner.nextLine();
            System.out.println(Solution2(string));
        }
    }
}
