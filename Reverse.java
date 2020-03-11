import java.util.Scanner;

public class Reverse {
    public static void reverseString(String string){
        String[]  str=string.split(" ");
       // String[] str2=new String[str.length];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.insert(0," "+str[i]);//每次前插
        }

        System.out.println(sb.toString().trim());//把第一个空格修剪了
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String string=scanner.nextLine();
            reverseString(string);
        }
    }
}
