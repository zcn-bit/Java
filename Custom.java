import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Custom{
    //思路：桌子承受力升序，消费降序，遍历M批客人，《=最大桌子人数，接待记录人数+消费，给它找桌子（二分查找），人数与中值比较，
    //选符合得最最左面得桌子，如果为空：累加消费，标记为有；如果为有，下一个，直到空，累加指为有
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            while(scanner.hasNext()){
                int n=scanner.nextInt();
                int m=scanner.nextInt();
                long max=0L;
                int[] a=new int[n];//数组中有n张桌子
                int [] vis=new int[n];//标记，如果这个桌子被占用就是1
                int[][] num=new int[m][2];//m批客人，有2个属性  人数+消费
                for(int i=0;i<n;i++){
                    a[i]=scanner.nextInt();//键盘接受n张桌子分别承受的最多人数
                }
                Arrays.sort(a);//按照桌子人数升序序排列
                for(int i=0;i<m;i++){
                    num[i][0]=scanner.nextInt();
                    num[i][1]=scanner.nextInt();
                }
                Arrays.sort(num, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] a, int[] b) {
                        return b[1]-a[1];//消费金额 降序
                    }
                });

                for(int i=0;i<m;i++){//遍历m批客人
                    if(a[n-1]<num[i][0]){//比最大桌子人数多，没必要继续下去
                        continue;
                    }
                 int nu=num[i][0];// 这批客人可以交易  人数       人数《=桌子承受
                    int price=num[i][1];//  消费

                    int index=dic(nu,a);
                    while(index<n&&vis[index]==1){//符合人数要求并且坐在了这张桌子上
                        index++;

                    }

                    if(index<n){
                        max=max+price;
                        vis[index]=1;//这张桌子有人坐了
                    }
                }//for

                System.out.println(max);


                }
            }

            public static int dic(int num,int[] a){
                int left=0;
                int right=a.length-1;
                int mid=0;
                while(left<=right){//这批客人这几张一样得桌子都可以做，那先选最最左边得（桌子按承受人数升序排列）
                    mid=(right+left)>>1;
                    if(num<=a[mid]){
                       right=mid-1;
                    }else{
                        left=mid+1;
                    }
                }
                return left;  //这批客人坐在哪个桌子上a[left]
        }
    }


