import java.util.Scanner;

public class QuNaEr2 {
    private static int solution(int n){

     if(n==0){
         return 1;
     }
     if(n==1){
         return 1;
     }
        int[] arr=new int[n+1];
        arr[0]=1;
        arr[1]=1;
     for(int i=2;i<=n;i++){
         //return arr[i-1]+arr[i-2];
         arr[i]=arr[i-1]+arr[i-2];
     }
      return arr[n];
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();


        System.out.println(solution(n));
    }
}
