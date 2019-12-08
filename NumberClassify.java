import java.util.Scanner;

public class NumberClassify {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();//jige
        int A1=0;
        int A3=0;
        int A2=0;
        int sum=0;
        int A4=0;
        int max=0;
        int A5=0;
        int flag=1;
        double A44=0;
boolean a1=false,a2=false,a3=false,a4=false,a5=false;

       for(int i=0;i<len;i++){
int N=in.nextInt();

            if((N%5==0)&&(N%2==0)){
a1=true;
                    A1=A1+N;
            }


                    if(N%5==1){
                a2=true;
                N=N*flag;

                A2=A2+N;
                flag=-flag;
                    }
                    if(N%5==2){
                a3=true;
                A3++;
                    }
                    if(N%5==3){
                a4=true;
                A4=A4+N;//数的和
                sum++;//个数
                    }
                    if(N%5==4){
                a5=true;
                if(N>max){
                    max=N;
                }

                    }




        }


        if (sum != 0) {

            A44 = (A4 / (sum*1.0));//0.1
        }

            A5 = max;


            System.out.print(a1 == true ? A1 + " " : 'N' + " ");
            System.out.print(a1 == true ? A2 + " " : 'N' + " ");
            System.out.print(a1 == true ? A3 + " " : 'N' + " ");


            System.out.print(a4 == true ? String.format("%.1f", A44) + " " : 'N' + " ");

            System.out.println(a5 == true ? A5 + " " : 'N' + " ");

        }


}


