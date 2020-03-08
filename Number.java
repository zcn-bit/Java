import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            if(n<2||n>=100){
                return;
            }//

            int m=n*n;
            String string=String.valueOf(m);//把这个十进制的long看作一个串
            String str=string.substring(1,string.length());//不要串的第一个xaibiao从0开始
            String strn=String.valueOf(n);//相当于两个串再做比较
            if(str.equals(strn)){//6.（4）
                System.out.println("YES!");
            }else {
                System.out.println("NO!");
            }
        }
    }
}
