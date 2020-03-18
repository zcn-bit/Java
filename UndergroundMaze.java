import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UndergroundMaze {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[][] option = new int[n][2];
            for (int i = 0; i < n; i++) {
                option[i][0] = scanner.nextInt();//增加还是删除
                option[i][1] = scanner.nextInt();//木棒的长度
            }
            solution(n, option);
        }
    }
    public static  void solution(int n,int[][] arr){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i][0]==1){
                list.add(arr[i][1]);
            }else {
                list.remove(arr[i][1]);
            }
            if(canFormPoly(list)){//可以构成多边形
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }
    public static boolean canFormPoly(List<Integer> list){
        int len=list.size();//总长
        for(int i=0;i<len;i++){
            int temp=list.remove(i);//把一个木棒移除  生成新的list
            int sum=0;
            for(int j=0;j<len-1;j++){
                sum=sum+list.get(j);//累加移除后的木棒之和
            }
            if(temp>=sum){
                list.add(i,temp);//将移除的数归还
                  return false;
            }
            //sum大
            list.add(i,temp);

        }
        return true;

    }

}
