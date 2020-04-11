import java.util.Scanner;

public class GoldCount {
   private static int solution(int initalGold,int kill){
       for (int i=0;i<kill;i++){
           initalGold=(int)Math.ceil(initalGold/2.0);
       }
       return initalGold;
   }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        for (int i=0;i<N;i++){
            int initalGold=scanner.nextInt();
            int kill=scanner.nextInt();
            System.out.println(solution(initalGold, kill));
        }
    }
}
