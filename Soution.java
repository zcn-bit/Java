import java.util.Scanner;

public class Soution {
    private static boolean isSushu(int n){
        boolean flag=true;
        int tmp=(int)Math.sqrt(n);
        if(n<3){
            return true;
        }
        for (int i=2;i<=tmp;i++){
            if(n%i==0){//能整除，则n不是素数
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static int solutions(int n){
        int leftNum=0;
        int rightNum=0;
        int result=0;
        for (int j=n+1;j>n;j++){
            if(isSushu(j)){
                rightNum=j;
                break;
            }
        }
        for (int i=n;i>=0;i--){
            if(isSushu(i)){
                leftNum=i;
                break;
            }
        }
        if((n-leftNum)>(rightNum-n)){
            result=rightNum;
        }else {
            result=leftNum;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int res=solutions(n);
            System.out.println(res);
        }
    }
}
