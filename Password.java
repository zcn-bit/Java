import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Password {

   public static boolean string_length(String   string){
       if(string.length()<=8){
           return  false;
       }else {
           return true;
       }
   }


    public static boolean string_type(String   string){
            int digit=0;
            int otherLetter=0;
            int upperLetter=0;
            int lowerLetter=0;
            for(int i=0;i<string.length();i++){//遍历字符串
                if(Character.isDigit(string.charAt(i))){
                    digit++;
                    continue;//一个字母只可能属于一种情况，符合即下一个
                }
                if(Character.isUpperCase(string.charAt(i))){
                    upperLetter++;
                    continue;//一个字母只可能属于一种情况，符合即下一个
                }
                if(Character.isLowerCase(string.charAt(i))){
                    lowerLetter++;
                    continue;//一个字母只可能属于一种情况，符合即下一个
                }else {//其他字符不一定是字母
                    otherLetter++;
                }


            }
            if((digit!=0&&upperLetter!=0&&lowerLetter!=0)||(digit!=0&&upperLetter!=0&&otherLetter!=0)||(digit!=0&&lowerLetter!=0&&otherLetter!=0)||(otherLetter!=0&&upperLetter!=0&&lowerLetter!=0)){//只要满足三种即可
                return true;
            }else {
                return false;
            }
    }


    public static boolean string_repeat(String   string){
      int len=string.length();
      int num=0;
      for(int i=3;i<len/2;i++){//步数
          for(int j=0;j<=len-i;j++){
              String s=string.substring(j,j+i);
              if(string.indexOf(s)!=string.lastIndexOf(s)){//从右到左
                  num++;

              }
          }

      }
      if(num!=0){//有重复
          return false;
      }else{
          return true;
      }


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String  string=scanner.nextLine();
            if(string_length(string)){ //长度符合
                if(string_type(string)){ //种类符合
                    if(string_repeat(string)){//重复性符合
                        System.out.println("OK");

                    }else {
                        System.out.println("NG");
                    }

                }else {
                    System.out.println("NG");
                }


            }else {
                System.out.println("NG");
            }

        }
    }
}
