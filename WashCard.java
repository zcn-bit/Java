import java.util.ArrayList;
import java.util.Scanner;

public class WashCard {

//数的范围自己无须做特殊处理，表示测试用例会那样做
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();//数据组数
        for(int i=0;i<T;i++){

            int n=in.nextInt();
            int k=in.nextInt();
            int[] arr=new int[2*n];


        for(int j=0;j<2*n;j++){
           arr[j]=in.nextInt();
        }
        //反转K次
            for(int times=0;times<k;times++){//操作K次
            getRes(arr,arr.length);//操作一次
        }
        for(int a=0;a<2*n-1;a++){//没有打印最后一个数，因为最后一个数分开处理，后面不能打印空格
            System.out.print(arr[a]+" ");
        }
            System.out.println(arr[2*n-1]);
        }
    }


    public static void getRes(int[] arr,int n){
        ArrayList<Integer>  list=new ArrayList<>();//借助list完成数组中元素顺序。再放回原数组中
        for(int i=0;i<n/2;i++){
            list.add(arr[i]);
            list.add(arr[i+n/2]);

        }//一次后的从上到下
        for(int i=0;i<n;i++){
            arr[i]=list.get(i);//list中值移到原数组arr中
        }

    }
}
