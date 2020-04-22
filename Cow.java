import java.util.Scanner;

public class Cow {
    private static int solution2(int n){
        int sum=1;//一个牛
        int year=1;
        int [] arr=new int[60];
        arr[0]=3;//第一个牛初始化年纪3岁
        while (n!=(year++)) {
            for (int i = 0; i < sum; i++) {//遍历每一只牛
                arr[i]++;//年纪++
                if (arr[i] >= 4) {
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;
        while ((n=scanner.nextInt())!=0){
            //  int n=scanner.nextInt();
//            int n=scanner.nextInt();
//            if(n!=0){
            System.out.println(solution2(n));
            //}

        }
    }
}
