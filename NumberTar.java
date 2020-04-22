import java.util.Scanner;

public class NumberTar {
    private static  int big(int a,int b){
        if(a>b){
            return a;
        } else{
            return b;
        }

    }

    private static int solution(int [][] arr,int n){
        int max=0;
        for (int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                arr[i][j]=big(arr[i][j]+arr[i-1][j-1],arr[i][j]+arr[i-1][j]);
                if(max<arr[i][j]){
                    max=arr[i][j];//即是每次累加的总和

                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[][] arr=new int[110][110];
        for (int i=0;i<N;i++){
            int n=scanner.nextInt();//n行
            for (int j=1;j<=n;j++){//0-n  1-n+1
                for(int k=1;k<=j;k++){//第i行i个数据
                    arr[j][k]=scanner.nextInt();

                }
            }//接受完毕
            //开始遍历，累加求和
            System.out.println(solution(arr, n));
        }
    }
}
