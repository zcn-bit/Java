import java.util.*;
public class When {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] hours = new int[n];
        int[] minutes = new int[n];
        for(int i=0;i<n;i++){
            hours[i] = sc.nextInt();
            minutes[i] = sc.nextInt();
        }
        int time = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int h2 = time/60;
        int m2 = time%60;
        int i = n-1;

        int ansh = -1;
        int ansm = -1;
        while(i>=0){
            int h3 = hours[i];
            int m3 = minutes[i];
            if(minutes[i]+m2>=60){
                h3 += 1;
                m3 += m2-60;
            }else
                m3 += m2;
            if((h2+h3==h&&m3<=m)||h2+h3<h){
                if(ansh<hours[i]||(ansh==hours[i]&&ansm<minutes[i])){
                    ansh = hours[i];
                    ansm = minutes[i];
                }
            }
            i--;
        }
        System.out.println(ansh+" "+ansm);
    }
}