import java.util.Scanner;

public class Result {

    public static void jiCheck(char[] str){
        for(int i=0;i<str.length;i++){//单独处理数组每一个元素
            int [] result=new int [8];
            int count=0;
            int one=0x01;
            for(int k=7;k>0;k--){

                result[k]=(str[i]&one)==0?0:1;
             if(result[k]==1){
                 count++;
             }
             one=one<<1;//扩大两倍

            }
            if(count%2==0){
                result[0]=1;
            }
            for(int j=0;j<result.length;j++){
                System.out.print(result[j]);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            char[] str = string.toCharArray();
            jiCheck(str);
        }
    }


}