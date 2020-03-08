import java.util.Scanner;

public class Prise {

   private static float noAward(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return  1;
        }else {
            return  (n-1)*(noAward(n-2)+noAward(n-1));
        }

    }
    private  static int probability(int n){
       if(n==0||n==1){
           return  1;
       }else {
           return n*probability(n-1);
       }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            float noNum=noAward(n);//不可能数
//            int[] array=new int[n];
//            for(int i=1;i<=n;i++){
//                array[i]=i;//  1 2  3
//            }



            int sum=probability(n);
           float result=(noNum/sum)*100;
//            System.out.printf("%.2f",result);
//            System.out.println("%");
            System.out.println(String.format("%.2f",result)+"%");
        }
    }
}
