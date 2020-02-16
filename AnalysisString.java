import java.util.Scanner;

public class AnalysisString {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString("21".split("-")));
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split("\\+");
        int sum=0;
        for (int i = 0; i < s.length; i++) {

            String[] sub=s[i].split("-");
            int temp=0;
            if (!sub[0].equals(""))
                temp=Integer.parseInt(sub[0]);
            for (int j = 1; j < sub.length; j++) {
                temp-=Integer.parseInt(sub[j]);
            }
            sum+=temp;
        }
        System.out.println(sum);

    }
}
