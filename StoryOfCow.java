import java.util.Scanner;

public class StoryOfCow {
    private static int solution1(int n){ //第n年
        int[] arr=new int[60];
        //arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;//第i年的牛的数量
        int i=0;
        if(n>=4) {
            for (i = 4; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 3];
            }
        }
        return arr[n];
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
int n=0;
        while ((n=scanner.nextInt())!=0){
          //  int n=scanner.nextInt();
//            int n=scanner.nextInt();
//            if(n!=0){
                System.out.println(solution1(n));
            //}

        }
    }
}
