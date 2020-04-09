import java.util.Scanner;

public class Mirror {
   private static String solution(String string) {
       char[] chars = string.toCharArray();
       char[] mirro = new char[chars.length];
      // StringBuffer sb = new StringBuffer(string);
       StringBuilder sb=new StringBuilder(string);
       StringBuilder res = sb.reverse();
       String str = res.toString();
      char[] aaa = str.toCharArray();
       for (int i = 0; i < chars.length; i++) {
           if (chars[i] == '1') {
               mirro[i] = '1';
           }
           if (chars[i] == '2') {
               mirro[i] = '5';
           }
           if (chars[i] == '3') {
               mirro[i] = '8';
           }
           if (chars[i] == '4') {
               mirro[i] = '7';
           }
           if (chars[i] == '5') {
               mirro[i] = '2';
           }
           if (chars[i] == '6') {
               mirro[i] = '9';
           }
           if (chars[i] == '7') {
               mirro[i] = '4';
           }
           if (chars[i] == '8') {
               mirro[i] = '3';
           }
           if (chars[i] == '9') {
               mirro[i] = '6';
           }
       }
       boolean flag = true;
       for (int j = 0; j < mirro.length; j++) {

               if (mirro[j] != aaa[j]) {
                   flag = false;
//                   break;
               }
//
//               } else {
//                   flag = false;
//                   break;
//
//               }
       }

       if (flag) {
           return "YES";

       }else {
           return "NO";
       }
   }
//            String mirrorString = mirro.toString();
//
//            if (mirrorString.equals(str)) {
//                return "YES";
//            } else {
//                return "NO";
//            }
//    }


//        StringBuffer sb=new StringBuffer(string);
//        StringBuffer res=sb.reverse();
//        String str=res.toString();
//        if(string.equals(str)){
//            return "YES";
//        }else {
//            return "NO";
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();//N组数据
        scanner.nextLine();
        for(int i=0;i<N;i++){
            String string=scanner.nextLine();
            System.out.println(solution(string));
        }
    }
}
