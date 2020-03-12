import java.util.Scanner;

public class GiveChange {

    public static void main(String[] args) {
        int[] array={17*29,29,1};
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String[] P=scanner.next().split("\\.");
            String[] A=scanner.next().split("\\.");
            //将每个数组元素由String变为int
            int[] tp={Integer.parseInt(P[0]),Integer.parseInt(P[1]),Integer.parseInt(P[2])};
            int[] ta={Integer.parseInt(A[0]),Integer.parseInt(A[1]),Integer.parseInt(A[2])};
            int p=tp[0]*array[0]+tp[1]*array[1]+tp[2]*array[2];
            int a=ta[0]*array[0]+ta[1]*array[1]+ta[2]*array[2];//单位是最小单位
            int t=a-p;
            if(t<0){//带的钱不够
                System.out.print("-");
                t=-t;//后面要除，不牵扯符号了，只是数字的事
            }
            System.out.println(t/array[0]+"."+t%array[0]/array[1]+"."+t%array[0]%array[1]/array[2]);


        }
    }
}
