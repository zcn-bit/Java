import java.util.Scanner;
public class PuzzleJigsaw {
    static String path="";//全局性
    static int [][]map;//类变量，全局变量
    static  int n,m;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while(scanner.hasNext()){
            n=scanner.nextInt();//行
            m=scanner.nextInt();//列
            int p=scanner.nextInt();//能量
            map=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    map[i][j]=scanner.nextInt();

                }

            }//
            //mapRun(0,0,p);//初始位置和能量
            System.out.println( mapRun(0,0,p));


        }
    }
    static String mapRun(int n,int m,int energy){
        fingPath(n,m,energy,"");
        return  path;//在下一个方法中操作
    }
    static void fingPath(int x,int y,int energy,String ret){
        if(x==0&&y==m-1){//最后一步出口  一定是没障碍物的
            if(energy>=0){
                path=ret+"[0,"+y+"]";

            }else{//没了能量
                path="can not escape!";
            }
        }

        if(x>=0&&x<=n-1&&y>=0&&y<=m-1&&map[x][y]==1) {//未到出口   没有障碍物时候
            ret = ret + "[" + x + "," + y + "],";//ret是除了出口的路径
            map[x][y]=0;//遍历过设为障碍

            fingPath(x + 1, y, energy, ret);
            fingPath(x - 1, y, energy - 3, ret);
            fingPath(x, y - 1, energy - 1, ret);
            fingPath(x, y + 1, energy - 1, ret);
            map[x][y]=1;//假设可以通过
        }

    }
}
