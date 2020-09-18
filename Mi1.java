
import java.util.Scanner;
public class Mi1 {
//    private static int[] solution(int n){//合数 6
//        int i=2;
//        while (true){
//            while (i<n&&n%i==0){
//
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n%2!=0){//质数
            System.out.println(n);
        }else{//合数
        //solution(n);
            int i=2;
            while (true){
                while (i<n&&n%i==0){//合数
                    System.out.println(i);
                    n=n/i;
                }
                if(i==n){//本身肯定也是合数
                   break;
                }
                i++;
            }
            System.out.println(i);
        }
    }
}
