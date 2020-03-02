import java.util.Scanner;

public class CheckCount {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        if (len == 1)
            System.out.println(1);
        else if (len == 2)
            System.out.println(4);
        else{
            System.out.println(len*(len-1)/2+len+1);
        }
    }
}
}
