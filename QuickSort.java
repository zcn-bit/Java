import java.util.ArrayList;

public class QuickSort {//升序排列

private static ArrayList<Integer> getLeastNumbers(int[] input,int k){
    ArrayList<Integer> result=new ArrayList<Integer>();//去接受方法的返回值
    int length=input.length;
    int start=0;
    int end=length-1;
    if(length<k||k==0||length==0){
        return result;

    }else{

    int index=partition(input,length,start,end);//得到中枢元素下标

//        if(index==k-1){//刚好
//            for(int i=0;i<=index;i++){
//                result.add(input[i]);
//            }
//            return result;
//        }else  {
            while(index!=k-1){
                if(index<k-1){
                    start=index+1;//index在内的有序了
                    partition(input,length,start,end);

                }else{//index>k
                end=index-1;
                partition(input,length,start,end);
                }
        }
            for(int i=0;i<k;i++){
                result.add(input[i]);
            }
            return result;
        }
    }


private static int partition(int[] data,int len,int start,int end){
int pivot=data[start];//先保留基准值
int begin=start;
int  last=end;
         while (begin<last){//挖坑填坑法
           while(begin<last&&data[last]>pivot){
               last--;
           }
           data[begin]=data[last];
           while(begin<last&&data[begin]<=pivot){
               begin++;
           }
           data[last]=data[begin];

         }
         data[begin]=pivot;
       return  begin;
    }
    public static void main(String[] args) {
        int [] input={12,4,0,1,55,7,2,4};
        int k=5;
        ArrayList<Integer> list=getLeastNumbers(input,k);
        System.out.println(list);
    }
}
