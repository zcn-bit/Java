import java.util.Scanner;

public class WordsReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String string=scanner.nextLine();
            StringBuffer sb=new StringBuffer();

            String[] arr=string.split("[^a-zA-Z]");//只匹配范围内部分
            for(int i=0;i<arr.length;i++){
                sb.insert(0," "+arr[i]);
            }
            String res=sb.toString().trim();
            System.out.println(res);

        }
    }
}
