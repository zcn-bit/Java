import java.util.Arrays;
import java.util.Scanner;
/*
将一组三个葡萄数想像成三条线段，如果能构成三角形（符合两短相加大于长），则三个人一人吃掉相邻两条边的一半就可以；如果不能构成三角形（即有一超长边），那么要把超长边平分给两个人吃，相当于折断长边，现在有4条边肯定能构成四边形，那么有两种情况：

        两个人吃完长边后不再吃短边，第三人吃完短边也没有超出另两个人；
        两人吃完长边后，如果不帮第三人吃两个短边，会使第三人吃的超过2人。
        第一种情况的输出就是长边的1/2；第二种情况则与三角形情况相同，需要所有人均分。
        因此，综合来看只有两种情况：所有人平分，或者其中两人平分最多的那种葡萄。这两个哪个大，输出哪个。
        */
public class EatGrape {
    public static int solution(int[] arr,int sum){
        Arrays.sort(arr);
        return Math.max((sum+2)/3,(arr[2]+1)/2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int[] arr = new int[3];
            int sum = 0;
            int[] grapes = new int[3];
            for (int j = 0; j < 3; j++) {
                grapes[j] = scanner.nextInt();//第i种葡萄有多少个
                sum += grapes[j];
            }

            System.out.println(solution(arr,sum));
        }
    }
}
