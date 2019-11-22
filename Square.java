import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();//控制列数  间接控制行数
        String s=in.next(); //字符(zifuchaun)怎么接受
        int hang=0;//控制行数
       if(len%2==0){//oushu
           hang=len/2;

       }else{
           hang=len/2+1;
       }
       for(int i=1;i<=hang;i++){
           if(i!=1&&i!=hang){  //不是第一行和最后一行情况下
               for(int j=1;j<=len;j++){//lieshu
                   if(j==1){//是第一列
                       System.out.print(s);
                   }
                   else if(j==hang){//最后一列
                       System.out.println(s);
                   }
                   else{
                       System.out.print(" ");//其他打印空格
                   }
               }
           }
           else{//处理第一行和最后一行
               for(int j=1;j<=len;j++){//遍历列
                   if(j==len){//最后一列
                       System.out.println(s);//打印完换行
                   }
                   else{
                       System.out.print(s);//直接打印
                   }
               }
           }

       }

    }

}
