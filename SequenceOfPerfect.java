import java.util.Map;
import java.util.Scanner;

public class SequenceOfPerfect {
    //错的点：只得到了第一个序列的长度      应该：可能分为好几个段（序列）    要选出最长的那个序列
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //while (scanner.hasNext()){
        int N=scanner.nextInt();//数据组数
//            int [] arr=new int[N];
        for(int i=1;i<=N;i++){
//                arr[i].length=scanner.nextInt();
            int n=scanner.nextInt();
            int [] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[i]=scanner.nextInt();
            }
            int curCount=1;
            int maxCount=1;
            int sum=arr[0];
            for(int j=1;j<n;j++) {
                if(arr[j]>=sum){
                    sum=sum+arr[j];
                    curCount++;
                    maxCount=Math.max(maxCount,curCount);
                }else{
                    curCount=1;
                    sum=arr[j];//重置sum
                }
            }
            System.out.println(maxCount);

        }
    }
}

