import java.util.Scanner;

public class Stars {
    private static int solution(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int x=arr[i][0];
            int y=arr[i][1];
            boolean x1flag=false;
            boolean x2flag=false;
            boolean y1flag=false;
            boolean y2flag=false;
            for(int j=0;j<arr.length;j++){//0 2
                     if(x==arr[j][0]&&y!=arr[j][1]){
                             //||(x!=arr[j][0]&&y==arr[j][1])){
                         //确定不是自己节点
                         if(arr[i][1]<y){
                             y1flag=true;
                         }
                        if(arr[i][1]>y) {
                             y2flag=true;
                         }


                     }
                     if(x!=arr[j][0]&&y==arr[j][1]){
                         if(arr[i][0]<x){
                             x1flag=true;
                         }
                         if(arr[i][0]>x){
                             x2flag=true;
                         }
                     }

            }
            if(x1flag&&x2flag&&y1flag&&y2flag){
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr=new int [n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=scanner.nextInt();
            arr[i][1]=scanner.nextInt();
        }

        System.out.println(solution(arr));
    }
}
