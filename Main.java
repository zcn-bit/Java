

    import java.util.*;
import java.math.*;

    public class Main{
        public static void main(String[] args){
            int[] count = new int[] {0,0,0,0,0,0,0,0,0,0};
            Scanner sc = new Scanner(System.in);
            BigInteger N;
            N = sc.nextBigInteger();
            Vector<Integer> num = new Vector<>();
            do {
                BigInteger M = N.mod(BigInteger.valueOf(10));
                num.add(M.intValue());
                N = N.divide(BigInteger.valueOf(10));
            } while (N.compareTo(BigInteger.valueOf(0)) > 0);
            for (int i = 0; i < num.size(); ++i) {
                switch (num.get(i)) {
                    case 0:
                        ++count[0];
                        break;
                    case 1:
                        ++count[1];
                        break;
                    case 2:
                        ++count[2];
                        break;
                    case 3:
                        ++count[3];
                        break;
                    case 4:
                        ++count[4];
                        break;
                    case 5:
                        ++count[5];
                        break;
                    case 6:
                        ++count[6];
                        break;
                    case 7:
                        ++count[7];
                        break;
                    case 8:
                        ++count[8];
                        break;
                    case 9:
                        ++count[9];
                        break;
                    default:
                        break;
                }
            }
            for (int j = 0; j < 10; ++j) {
                if (count[j] != 0)
                    System.out.println(j + ":" + count[j]);
            }
        }

}
