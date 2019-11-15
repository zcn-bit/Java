import java.util.*;

public class Remove {



public static int getLastDeletedindex(int len){
    if (len<=0){

        return -1;
    }
        int[] arr=new int[len];
    for (int i=0;i<len;i++){

        arr[i]=i;
    }//把数组填满

    final int DELFLAG=len+1;//标志位
        int currentSize=len;//当前元素个数
        final int SETPS=2;
        int count=0;
        int lastDelIndex=0;

        int i=0;
        while(currentSize!=0) {
            if (arr[i] != DELFLAG) {

                if (count == SETPS) {//这个位置要删除
                    arr[i] = DELFLAG;
                    lastDelIndex = i;//最后一个删除的下标
                    currentSize--;
                    count = -1;
                }
                else{//不删
                    count++;
                }


            }


            i = (i + 1) % len;//体现循坏
        }
       return lastDelIndex;
    }



    public static void main(String[] args) {
        int index = getLastDeletedindex(4);
        System.out.println("index:" + index);
    }
}
