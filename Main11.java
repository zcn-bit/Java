import java.util.Scanner;
public class Main11 {
    //    private static int Solution1(String string){
//       char[] s=string.toCharArray();
// //首先就去掉最后一个
//        //串长再不断缩小，返回的肯定是目前为止最长的
//        for (int slen = (s.length - 1) / 2; slen >= 1; slen--) { //如果是奇数长，最后一个很自然不要
//            //第二个串的起始下标
//            boolean  is_even_str = true;
//            for (int i = 0; i < slen; i++) {
//                if (s[i] != s[slen + i]) {
//                    is_even_str = false;//不是偶串
//                    break;
//                }
//            }
//            if (is_even_str) {//都相等
//                //cout << (slen * 2) << endl;
//             return   slen*2;
//
//            }
//        }
//      return -1;
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (scanner.hasNext()) {
           String string = scanner.nextLine();
           char[] s = string.toCharArray();
           //首先就去掉最后一个
           //串长再不断缩小，返回的肯定是目前为止最长的
           for (int slen = (s.length - 1) / 2; slen >= 1; slen--) { //如果是奇数长，最后一个很自然不要
               //第二个串的起始下标
               boolean is_even_str = true;
               for (int i = 0; i < slen; i++) {
                   if (s[i] != s[slen + i]) {
                       is_even_str = false;//不是偶串
                       break;
                   }
               }
               if (is_even_str) {//都相等
                   //cout << (slen * 2) << endl;
                   System.out.println(slen * 2);

               }

               //System.out.println(res);
           }
       }
        }
    }



