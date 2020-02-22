
import java.util.*;
public class AdjustMin {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int minC = 0;
        int minD = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'C'){
                minC += i - count;
                count++;
            }
        }
        count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'D'){
                minD += i - count;
                count++;
            }
        }
        System.out.println(Math.min(minC,minD));
    }

}