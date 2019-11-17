import java.util.Scanner;
public class FibonacciSteps {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

int a=0;
int b=1;//ab的初始化（一开始的值）是给出的  b是两个数中最大的，用B与x的值大小关系，判断x处于那两个数之间

while(N>b){



    int tmp=a+b;
    a=b;//ab每次都是更新的，并且注意赋值先后顺序，避免覆盖
    b=tmp;
}
//    上一次循坏成立，说明这次N>a  这次循坏不成立，说明b<N   a<N < b

int result=Math.min((N-a),(b-N));
        System.out.println(N-a);

    }
}
