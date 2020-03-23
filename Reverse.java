import java.util.Scanner;

public class Reverse {
    public  static String reverse(String sentence){
        String [] chars=sentence.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<chars.length;i++){
            sb.insert(0," "+chars[i]);
        }
        String result=sb.toString().trim();//修剪前后空格
        return result;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            System.out.println( reverse(str));


        }
    }
}
