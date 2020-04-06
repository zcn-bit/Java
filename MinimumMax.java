import java.util.Scanner;

public class MinimumMax {//给一个数X，输出最小的一个数n的各位和为X
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//接下来要输入n个数
        for (int i=0;i<n;i++){
            StringBuffer sb=new StringBuffer();
            int sum=scanner.nextInt();//先输入一个
            int k=sum/9;//有几个9
            int m=sum%9;
            if(m!=0){//含有9，整除后剩余的（还不够9）
                sb.append(m);
            }
            for(int j=0;j<k;j++){//剩下的9放到后面追加
                sb.append(9);
            }
            System.out.println(sb);

        }
    }
}
