import sun.applet.Main;

import java.util.Scanner;

public class Main3 {
    private long a;
    private long b;

    public Main3(long a, long b){
        this.a = a;
        this.b = b;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        Main3 m = new Main3(x, y);
        System.out.println(m.test());
    }

    public int test(){
        if (a <= b) {
            int count = 0;
            for(long i=a; i<=b; i++) {
                if(i%3 != 1) {//14

                    count ++;
                }
            }
            return count;
        } else {
            return 0;
        }
    }
}

