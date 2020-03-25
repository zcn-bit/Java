import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String symbol="ABCDEFGHIGKLMNOPQRSTUVWXYZ1234567890";
        String number="222333444555666777788899991234567890";
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            ArrayList<String> arrayList=new ArrayList<String>();//放最终结果的
            for(int i=0;i<n;i++) {
                String str = scanner.nextLine();
                str=str.replace("-", "");
                String result = "";
                for (int j = 0; j < 7; j++) {
                    //利用下标对应替换
                    result = result + number.charAt(symbol.indexOf(str.charAt(j)+""));
                }
                result = result.substring(0, 3) + "-" + result.substring(3,7);
                if (!arrayList.contains(result)) {
                    arrayList.add(result);
                }
            }
                Collections.sort(arrayList);//字典序输出
                for (int j=0;j<arrayList.size();j++){
                    System.out.println(arrayList.get(j));
            }
            System.out.println();//与下一次空格分开
        }
    }
}
