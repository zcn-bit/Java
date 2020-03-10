
import java.util.Scanner;
public class Main{//关于dp算法
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int[] num = new int[n];
            for(int i=0;i<n;i++){
                num[i] = sc.nextInt();
            }
            long[] count = new long[sum+1];
            count[0] = 1;
            for(int i=0;i<n;i++){
                if(num[i]<=sum){
                    for(int j=sum;j>=0;j--){
                        if(count[j]>0 && j+num[i]<=sum){
                            count[j+num[i]] += count[j];
                        }
                    }
                }
            }
            System.out.println(count[sum]);
        }
    }
}

