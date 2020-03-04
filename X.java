import java.util.*;

public class X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer> map=new HashMap<>();


        while (scanner.hasNext()) {
            int n = scanner.nextInt();

            for(int i=0;i<n;i++) {
           map.put(scanner.nextInt(),i);

            }
            int X=scanner.nextInt();
            if(map.containsKey(X)){
                System.out.println(map.get(X));
            }else {
                System.out.println(-1);
            }


        }
    }
}