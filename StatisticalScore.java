import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StatisticalScore {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNextInt()){
            int N=in.nextInt();//N个数据
            if(N==0){
                break;
            }
            List<Integer> list=new ArrayList<>();//存放输入的整型分数
            for(int i=0;i<N;i++){
                //输入N个数据
                list.add(in.nextInt());
            }
            int  score=in.nextInt();
            //遍历list找到与score相同的数的个数
            int count=0;//存储符合要求的个数
            for(int a:list){
             if(score==a){
             count++;
             }

            }
            System.out.println(count);//打印在循坏里面
                }
    }
}
