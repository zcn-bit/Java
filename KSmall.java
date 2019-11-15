import java.lang.reflect.Array;
import java.lang.System;
import java.util.*;
import java.util.TreeSet;
public class KSmall {//数组？list？


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[100];
        int i = 0;
        while (!in.hasNext("stop")) {//为了能在本地IDE上面运行，需要加上一个终止条件。输入stop循环终止
            a[i] = in.nextInt();
            i++;
        }//i=5
       // int key = a[i];
        int[] arr = new int[--i];//i=4
        System.arraycopy(a, 0, arr, 0, i);


        Arrays.sort(arr);//数组排序
        for (int j = 0; j <a[i]; j++) {
         //   if (j == a[i] - 1) {
               System.out.print(arr[j]+" ");
        //    } else {
                //System.out.println(arr[j]);
            }
        }
    }




    /*
    public static ArrayList<Integer>  getLeastNumbers(int[] arr,int k){

        ArrayList<Integer>  list=new ArrayList<Integer>();
        if(arr.length<=0||k<=0){
            return  list;

        }
        //treeset会将元素默认升序排序
        TreeSet<Integer>  set=new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }

        });

        for(int i=0;i<arr.length;i++){
            if(i<k){//前K个数先放进去  假设为最小的K个数
                set.add(arr[i]);
            }
            else{//最大的数字
                if(set.first()>arr[i]){//K后的数和set中的数比较
                    set.remove(set.last());//删除最后一个即升序中最大的一个】
                    set.add(arr[i]);
                }
            }


        }


        if(!set.isEmpty()){
            list.addAll(set);
        }

        Collections.reverse(list);
        return list;
    }




    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n=0;

  int[] arr=new int[101];
        while(in.hasNext()) {
            for (int i = 0; i <= n; i++) {
                arr[i] = in.nextInt();
            }
        }
        System.arraycopy(arr,0,array,0,i);
        int k=arr[n];
        getLeastNumbers(arr,k);
        System.out.println(  getLeastNumbers(arr,k));






    }

}
*/