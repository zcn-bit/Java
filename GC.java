import java.util.Scanner;

public class GC {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int len = string.length();//总长度
        int N = in.nextInt();//子长度
        int[] count = new int[len - N + 1];

        //遍历str
        for (int i = 0; i <= len - N; i++) {//[0,10]
            for (int j = i; j < i + N; j++) {//从该位置开始遍历5个
                if(string.charAt(j)=='G'||string.charAt(j)=='C'){
                    count[i]=count[i]+1;//数组中每个元素可累加

                }
            }
        }

        int max=count[0];//假设默认
        int k=0;
        for(int i=1;i<count.length;i++){
            if(count[i]>max){
                max=count[i];
                k=i;//记录开始下标
            }
        }


        System.out.println(string.substring(k,k+N));//左闭右开
    }


}
