
import java.util.*;

public class StringRelation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            boolean result = str1.contains(str2) || str2.contains(str1);
            if(result)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}