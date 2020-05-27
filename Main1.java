import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1 {
    public static int bin(int num,int [] desks){//人数 桌子容纳人数
        int left=0;
        int right=desks.length-1;
        int mid=0;
        while (left<=right){
            mid=(left+right)/2;
            if(num<=desks[mid]){//选择最小的桌子
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return left;//坐的桌子下标
    }
   public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       int m=scanner.nextInt();
       int[] desks=new int[n];
       int[] tmp=new int[n];
       for(int i=0;i<n;i++){
           desks[i]=scanner.nextInt();
       }
       Arrays.sort(desks);//桌子人数 默认升序
       //m批客人   b c
       int[][] man=new int[m][2];
       for(int i=0;i<m;i++){
           man[i][0]=scanner.nextInt();
           man[i][1]=scanner.nextInt();
       }
       //对m批客人排序
       Arrays.sort( man, new Comparator<int[]>() {//比较器比较元素类型是数组
           @Override
           public int compare(int[] o1, int[] o2) {
               return o2[1]-o1[1];//对消费额降序排序
           }
       });
       long sum=0;
       for (int i=0;i<m;i++){
           if(desks[n-1]>=man[i][0]){//保证一个最大的前提 最大桌子可容纳
               int num=man[i][0];
               int p=man[i][1];
               int index=bin(num,desks);
               while (index<n && tmp[index]==1){//有人坐了++
                   index++;
               }
               if(index<n){//合理下标
                  sum+=p;//
                  tmp[index]=1;//客人已经坐下，标记为1，有人了
               }

           }
       }
       System.out.println(sum);

   }

}
