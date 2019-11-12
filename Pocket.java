import java.util.Scanner;

public class Pocket {
    static int n = 0;//shuzidaxiao
    static int[] arr;
    static int count = 0;//背包总共count个物品总体积40


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            n = in.nextInt();//比如第一行输入3，3本身+3个物品共4个数组元素
            arr = new int[n + 1];//[0,n+1]  [0]是物品个数  【1，n】是n个物品N个体积
            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextInt();
            }//键盘输入N个物品体积
            beibao(40, n);//背包总体积(背包余量)40，n个物品体积
            System.out.println(count);
        }

    }


    public static void beibao(int s,int n){//递归
        if(s==0){//余量为0
           count++;//这个方式合理

        }
        if(s<=0||(s>0&&n<0)){//背包满了，但是没有物品
            return ;
        }
        beibao(s-arr[n],n-1);//从最后一个开始装  余量+物品个数
        beibao(s,n-1);//???  //最后一个装完了，新背包+除最后一个物品剩下的物品个数
        //不一定每个背包都有第N个，
    }



}

//怎么确定 ？几个物品体积之和为40  选出一些是几个？