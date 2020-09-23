import javafx.scene.transform.Scale;

import java.util.Scanner;

public class QuNaEr {
    public static int solution(int n){
        if(n==1){
           return 1;
        }
        if(n==2){
            return 2;
        }
       return solution(n-1)+solution(n-2);
    }
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        int n=scanner.nextInt();


        System.out.println(solution(n));
    }
}
