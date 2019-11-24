import java.util.List;
        import java.util.Scanner;

public class MinNumber {



    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[10];//存放输入的10个数
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();//jieshou
        }
        in.close();
        for(int i=1;i<arr.length;i++){//0不能开头
            if(arr[i]!=0){//如果等于0.往后延，因为要找小的数，所以从前面找
                System.out.print(i);//这个数个数不为0，先打印作为开头
                arr[i]--;//个数-1
                break;
            }
        }//为了找到开头
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){//从前往后。只要个>0.循坏打印这个数
                System.out.print(i);
                arr[i]--;//个数--
            }
        }


    }

}
