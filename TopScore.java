import java.util.Scanner;

public class TopScore {
    public static int top(int[] arr,int a,int b){
        int max=arr[a];
        for(int i=a;i<=b;i++){

            if(arr[i]>max){
                max=arr[i];
            }
        }
        return  max;

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int[] arr={};
        while(in.hasNext()){
            int N=in.nextInt();//学生
            int M=in.nextInt();//操作
          arr=new int[N+1];
            for(int i=1;i<=N;i++){
                arr[i]=in.nextInt();

            }//学生初始成绩
            for(int i=1;i<=M;i++){
                char c=in.next().charAt(0);//接受字符
                int A=in.nextInt();
                int B=in.nextInt();

                if(c=='U'){
                    arr[A]=B;

                }
                if(c=='Q') {//询问
                 int  print= top(arr,A,B);
                    System.out.println(print);
                }
                }

            }

        }
    }



