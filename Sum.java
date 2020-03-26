import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    static ArrayList<ArrayList<Integer>>  res=new  ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> list=new ArrayList<>();
    //类变量，全局变量

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            dfs(1,m,n);
            for(ArrayList<Integer> l:res) {//遍历res
                int i = 0;
                for (; i <l.size()-1;i++) {//遍历list
                    System.out.print(l.get(i)+" ");

                }
                System.out.println(l.get(i));//最后一个元素单独处理不加空格
            }
        }
    }



    public static void dfs(int index,int count,int n){//n个数，和为count
        if(count==0){
            res.add(new ArrayList<>(list));
        }else {
            for (int j=index;j<=count&&j<=n;j++){//下限
                list.add(j);//1
                dfs(j+1,count-j,n);
                list.remove(list.size()-1);
            }

        }

    }
}
