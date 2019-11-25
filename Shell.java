import java.util.Scanner;
//输入数据范围类型？
public class Shell {
public static final long  LIMIT=300000;//最多搜索次数
    public static final long N=1000000007;//求余  贝壳在被整除的整数倍
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while(in.hasNext()){
            System.out.println(sol(in.nextLong()));

        }

    }



    public static  long sol(long in) {//传进去初始位置
        //如果初始状态为0.则可直接可行，返回0次
        if (in == 0) {
            return 0L;//long类型

        } else {
            //初始位置不为0 ，开始搜索
            return search(in);
        }
    }

        //不为0的搜索
        public  static long search(long in){
            //初始坐标
            long temp=in;
            for(int i=1;i<LIMIT;i++){
                temp=(temp*2+1)%N;
                if(temp%N==0){
                    for(int j=0;j<=(i/2);j++){
                        if((i-2*j)%3==0){
                            return ((i+j)/3);
                        }
                    }
                }
            }
  //  出了for循坏;

    return  -1;

    }
}
