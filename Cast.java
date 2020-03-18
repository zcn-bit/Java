import java.util.Scanner;

public class Cast {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()) {
            String string=scanner.nextLine();
            System.out.println(Integer.decode(string));
        }

        }
    }

