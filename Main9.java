

        import java.io.BufferedInputStream;
        import java.util.ArrayDeque;
        import java.util.Deque;
        import java.util.Scanner;

public class Main9{
    private static class BottleSpace{
        int [] spaces;
        int step;
        static boolean [] isVisiteds=new boolean[64*64*64*64];
        BottleSpace(int [] spaces, int step){
            this.spaces = new int[spaces.length];
            System.arraycopy(spaces,0,this.spaces,0, spaces.length);
            this.step=step;
        }
        //移动from的瓶子的水到to,直到to瓶子满
        public static void mov(int[] srcSpaces, int from, int to, BottleSpace maxBottle){
            if(srcSpaces[from]==0) return ;
            int diff;
            if((diff=srcSpaces[from]+srcSpaces[to]-maxBottle.spaces[to])>=0){
                srcSpaces[from]=diff;
                srcSpaces[to]=maxBottle.spaces[to];
            }else{
                srcSpaces[to]=srcSpaces[from]+srcSpaces[to];
                srcSpaces[from]=0;
            }
        }
        //判断该瓶子系列是否已被访问,是返回true，否返回false，并标志为true
        public static boolean isVisited(int []bottles){
            int index= getIndexBottles(bottles);
            if(isVisiteds[index]) return true;
            else {
                isVisiteds[index]=true;
                return false;
            }
        }
        //获取当前瓶子系列状态
        //瓶子容量为>=0&&<64,用6位表示,0-5为1瓶容量,6-11为2瓶容量,类推
        public static int getIndexBottles(int []bottles){
            int index=0;
            for(int i = 0; i<bottles.length; i++){
                index+=(bottles[i]<<(6*i));
            }
            return index;
        }
    }
    public static void main(String[] args) {
        final int bottleSize=4;
        Scanner in=new Scanner(new BufferedInputStream(System.in));
        int []s=new int[bottleSize];
        int []t=new int[bottleSize];
        for(int i=0;i<bottleSize;i++){
            s[i]=in.nextInt();
        }
        for(int i=0;i<bottleSize;i++){
            t[i]=in.nextInt();
        }
        in.close();

        int goalIndex=BottleSpace.getIndexBottles(t);//目标瓶子系列下标
        BottleSpace sBottle=new BottleSpace(s,0);
        Deque<BottleSpace> bottleQueue=new ArrayDeque<>();
        bottleQueue.add(new BottleSpace(new int[bottleSize],0));
        BottleSpace.isVisiteds[0]=true;
        //BFS
        while(!bottleQueue.isEmpty()){
            BottleSpace curBottle=bottleQueue.pollFirst();
            int []cur=curBottle.spaces;
            int step=curBottle.step;
            if(BottleSpace.getIndexBottles(cur)==goalIndex){
                System.out.println(step);
                return ;
            }

            for(int i=0;i<bottleSize;i++){
                int original=cur[i];
                //将瓶子i清空
                cur[i]=0;
                if(!BottleSpace.isVisited(cur))//该瓶子系列未被访问
                    bottleQueue.addLast(new BottleSpace(cur,step+1));
                //将瓶子i填满
                cur[i]=sBottle.spaces[i];
                if(!BottleSpace.isVisited(cur))
                    bottleQueue.addLast(new BottleSpace(cur,step+1));
                cur[i]=original;
            }

            //将瓶子i的水倒到瓶子j,直到瓶子j满
            for(int i=0;i<bottleSize;i++){
                for(int j=0;j<bottleSize;j++){
                    if(i!=j){
                        int []curCopy=new int[cur.length];
                        System.arraycopy(cur,0,curCopy,0,cur.length);
                        BottleSpace.mov(curCopy,i,j,sBottle);
                        if(!BottleSpace.isVisited(curCopy))
                            bottleQueue.add(new BottleSpace(curCopy,step+1));
                    }
                }
            }
        }
        System.out.println(-1);
    }
}