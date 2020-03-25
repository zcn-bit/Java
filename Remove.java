import java.util.Scanner;

public class Remove {
    static  int x,y=0;//主函数上面，全局变量
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
    String string=scanner.nextLine();
    String[] str=string.split(";");

  for(String s:str){
      if(s.charAt(0)=='A'){
          if(s.substring(1).matches("[0-9]+")){
              x=x-Integer.parseInt(s.substring(1));
          }
      }
      if(s.charAt(0)=='D'){
          if(s.substring(1).matches("[0-9]+")){
              x=x+Integer.parseInt(s.substring(1));
          }
      }
      if (s.charAt(0)=='W') {
          if(s.substring(1).matches("[0-9]+")){
              y=y+Integer.parseInt(s.substring(1));
          }
      }
      if(s.charAt(0)=='S'){
          if(s.substring(1).matches("[0-9]+")){
              y=y-Integer.parseInt(s.substring(1));
          }
      }
      }
            System.out.println(x+","+y);
  }
}
    }


