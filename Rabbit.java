import java.util.Scanner;

public class Rabbit {
    public static int  getTotalRabbit(int month){
        if(month==1||month==2)
        {
            return 1;

        }

        else{

             return getTotalRabbit(month-1)+getTotalRabbit(month-2);




        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int month=in.nextInt();
        System.out.println(   getTotalRabbit(month));
    }

}
