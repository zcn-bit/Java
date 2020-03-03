import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            int n=scanner.nextInt();
            if(n<=0&&n>=40000){
                return;
            }
            int m=n*n;//平方
            int sum1=0;
            int sum2=0;
            while(n>0){
                sum1=sum1+n%10;//学会用循坏
                n=n/10;//1/10==0
            }
            while(m>0){//是为了限制下线
                sum2=sum2+m%10;
                m=m/10;
            }
            System.out.println(sum1+" "+sum2);
        }
        }
}
