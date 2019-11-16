import java.util.Scanner;
public class Count {
    public static int factorial(int number){
        if(number==0||number==1){
            return  1;
        }
        return  number*factorial(number-1);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count=0;
     int result= factorial(number);
while(result!=0){
    if(result%10==0){
        count++;
    }
    else{
        break;
    }
    int tmp=result/10;
    result=tmp;
}
        System.out.println(count);


    }
}
